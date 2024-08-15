package com.pat.portfolio.components.contactSection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.pat.portfolio.components._widgets.inputs.InputElement
import com.pat.portfolio.components._widgets.inputs.PrimaryButton
import com.pat.portfolio.components._widgets.inputs.TextareaElement
import com.pat.portfolio.core.constants.Font.SUBTITLE_SIZE
import com.pat.portfolio.dtos.EmailJsFormDto
import com.pat.portfolio.infrastructure.emailJsInfrastructureSendForm
import com.pat.portfolio.observables.EmailJsObservable
import com.pat.portfolio.observables.SendingStatus
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.browser.document
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Form
import org.w3c.dom.HTMLFormElement
import org.w3c.dom.HTMLTextAreaElement

@Composable
fun ContactForm() {
    val scope = rememberCoroutineScope()
    Form(
        attrs = Modifier
            .id("contact_form")
            .fillMaxWidth()
            .toAttrs()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            InputElement(
                id = "user_name",
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 15.px),
                text = "Name *",
                value = EmailJsObservable.name,
                isRequired = true,
                onValueChange = { value -> EmailJsObservable.name = value }
            )
            InputElement(
                id = "user_email",
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 15.px),
                text = "Email *",
                value = EmailJsObservable.email,
                isRequired = true,
                inputType = InputType.Email,
                onValueChange = { value -> EmailJsObservable.email = value }
            )
            TextareaElement(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 25.px),
                id = "message",
                text = "Message *",
                isRequired = true
            )
            PrimaryButton(
                onSubmit = { event ->
                    event.preventDefault()
                    val form = (document.getElementById("contact_form") as HTMLFormElement)
                    if (form.checkValidity()) {
                        EmailJsObservable.message = (document.getElementById("message") as HTMLTextAreaElement).value

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
                    } else {
                        form.reportValidity()
                    }
                },
                content = {
                    SpanText(
                        modifier = Modifier.fontSize(SUBTITLE_SIZE),
                        text = "SEND MESSAGE"
                    )
                }
            )
        }
    }
}