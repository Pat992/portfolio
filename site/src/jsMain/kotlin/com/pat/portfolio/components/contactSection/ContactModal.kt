package com.pat.portfolio.components.contactSection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.pat.portfolio.components._widgets.Modal
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.inputs.PrimaryButton
import com.pat.portfolio.components._widgets.inputs.SecondaryButton
import com.pat.portfolio.components._widgets.svgs.SvgWidget
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.constants.Font.SUBTITLE_SIZE
import com.pat.portfolio.core.constants.SvgPaths.ERROR_PATH
import com.pat.portfolio.core.constants.SvgPaths.SENDING_PATH
import com.pat.portfolio.core.constants.SvgPaths.SUCCESS_PATH
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.dtos.EmailJsFormDto
import com.pat.portfolio.infrastructure.emailJsInfrastructureSendForm
import com.pat.portfolio.observables.EmailJsObservable
import com.pat.portfolio.observables.SendingStatus
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.browser.document
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.px
import org.w3c.dom.HTMLTextAreaElement

@Composable
fun ContactModal() {
    val sendingStatus = EmailJsObservable.sendingStatus
    val scope = rememberCoroutineScope()
    Modal {
        Card(
            modifier = Modifier.width(500.px),
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(all = 15.px),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SvgWidget(
                        path = when (sendingStatus) {
                            SendingStatus.SENDING -> SENDING_PATH
                            SendingStatus.SUCCESS -> SUCCESS_PATH
                            SendingStatus.FAILURE -> ERROR_PATH
                            else -> ""
                        },
                        height = 200.0,
                        width = 200.0,
                        color = Theme.SecondaryTextColor.hex,
                        viewBoxValue = "0 -960 960 960",
                    )
                    Subtitle(
                        modifier = Modifier.padding(topBottom = 15.px),
                        text = when (sendingStatus) {
                            SendingStatus.SENDING -> "Sending message..."
                            SendingStatus.SUCCESS -> "Your message has been sent successfully."
                            SendingStatus.FAILURE -> "Failed to send your message, please try again."
                            SendingStatus.NULL -> ""
                        }
                    )
                    if (sendingStatus == SendingStatus.SUCCESS)
                        PrimaryButton(
                            modifier = Modifier.fillMaxWidth(),
                            onSubmit = {
                                (document.getElementById("message") as HTMLTextAreaElement).value = ""
                                EmailJsObservable.name = ""
                                EmailJsObservable.email = ""
                                EmailJsObservable.message = ""
                                EmailJsObservable.sendingStatus = SendingStatus.NULL
                            },
                            content = {
                                SpanText(modifier = Modifier.fontSize(SUBTITLE_SIZE), text = "Close")
                            }
                        )
                    if (sendingStatus == SendingStatus.FAILURE)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            PrimaryButton(
                                modifier = Modifier.fillMaxWidth().margin(right = 7.5.px),
                                onSubmit = {
                                    val emailJsFormDto = EmailJsFormDto(
                                        name = EmailJsObservable.name,
                                        email = EmailJsObservable.email,
                                        message = EmailJsObservable.message
                                    )
                                    scope.launch {
                                        EmailJsObservable.sendingStatus = SendingStatus.SENDING
                                        val res = emailJsInfrastructureSendForm(emailJsFormDto)
                                        if (res) EmailJsObservable.sendingStatus = SendingStatus.SUCCESS
                                        else EmailJsObservable.sendingStatus = SendingStatus.FAILURE
                                    }
                                },
                                content = {
                                    SpanText(modifier = Modifier.fontSize(SUBTITLE_SIZE), text = "Retry")
                                }
                            )
                            SecondaryButton(
                                modifier = Modifier.fillMaxWidth().margin(left = 7.5.px),
                                onSubmit = {
                                    EmailJsObservable.sendingStatus = SendingStatus.NULL
                                },
                                content = {
                                    SpanText(modifier = Modifier.fontSize(SUBTITLE_SIZE), text = "Cancel")
                                }
                            )
                        }
                }
            }
        )
    }
}