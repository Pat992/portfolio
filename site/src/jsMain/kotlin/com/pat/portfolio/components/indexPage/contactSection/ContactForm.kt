package com.pat.portfolio.components.indexPage.contactSection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.pat.portfolio.components._widgets.buttons.PrimaryButton
import com.pat.portfolio.components._widgets.inputs.InputElement
import com.pat.portfolio.components._widgets.inputs.TextareaElement
import com.pat.portfolio.core.constants.FontSizes.SUBTITLE_SIZE
import com.pat.portfolio.observables.EmailJsObservable
import com.pat.portfolio.repositories.emailJsRepositorySendEmail
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
                        scope.launch {
                            emailJsRepositorySendEmail()
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