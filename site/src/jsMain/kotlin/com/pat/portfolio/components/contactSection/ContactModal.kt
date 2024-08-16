package com.pat.portfolio.components.contactSection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.pat.portfolio.components._widgets.Modal
import com.pat.portfolio.components._widgets.buttons.PrimaryButton
import com.pat.portfolio.components._widgets.buttons.SecondaryButton
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.svgs.SvgElement
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.constants.FontSizes.SUBTITLE_SIZE
import com.pat.portfolio.core.constants.SvgPaths.ERROR_PATH
import com.pat.portfolio.core.constants.SvgPaths.SENDING_PATH
import com.pat.portfolio.core.constants.SvgPaths.SUCCESS_PATH
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.observables.EmailJsObservable
import com.pat.portfolio.observables.RequestStatus
import com.pat.portfolio.repositories.emailJsRepositoryCancelRetry
import com.pat.portfolio.repositories.emailJsRepositoryOnSuccessResetForm
import com.pat.portfolio.repositories.emailJsRepositorySendEmail
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.px

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
                    SvgElement(
                        path = when (sendingStatus) {
                            RequestStatus.LOADING -> SENDING_PATH
                            RequestStatus.SUCCESS -> SUCCESS_PATH
                            RequestStatus.FAILURE -> ERROR_PATH
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
                            RequestStatus.LOADING -> "Sending message..."
                            RequestStatus.SUCCESS -> "Your message has been sent successfully."
                            RequestStatus.FAILURE -> "Failed to send your message, please try again."
                            RequestStatus.NULL -> ""
                        }
                    )
                    if (sendingStatus == RequestStatus.SUCCESS)
                        PrimaryButton(
                            modifier = Modifier.fillMaxWidth(),
                            onSubmit = {
                                emailJsRepositoryOnSuccessResetForm()
                            },
                            content = {
                                SpanText(modifier = Modifier.fontSize(SUBTITLE_SIZE), text = "Close")
                            }
                        )
                    if (sendingStatus == RequestStatus.FAILURE)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            PrimaryButton(
                                modifier = Modifier.fillMaxWidth().margin(right = 7.5.px),
                                onSubmit = {
                                    scope.launch {
                                        emailJsRepositorySendEmail()
                                    }
                                },
                                content = {
                                    SpanText(modifier = Modifier.fontSize(SUBTITLE_SIZE), text = "Retry")
                                }
                            )
                            SecondaryButton(
                                modifier = Modifier.fillMaxWidth().margin(left = 7.5.px),
                                onSubmit = {
                                    emailJsRepositoryCancelRetry()
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