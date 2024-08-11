package com.pat.portfolio.components.contactSection

import androidx.compose.runtime.*
import com.pat.portfolio.components._widgets.inputs.InputElement
import com.pat.portfolio.components._widgets.inputs.InputSubmitElement
import com.pat.portfolio.components._widgets.inputs.TextareaElement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.toAttrs
import kotlinx.browser.document
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Form
import org.w3c.dom.HTMLTextAreaElement

@Composable
fun ContactForm() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }
    Form(
        attrs = Modifier
            .fillMaxWidth()
            .toAttrs()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            InputElement(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 15.px),
                text = "Name *",
                value = name,
                isRequired = true,
                onValueChange = { value -> name = value }
            )
            InputElement(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 15.px),
                text = "Email *",
                value = email,
                isRequired = true,
                inputType = InputType.Email,
                onValueChange = { value -> email = value }
            )
            TextareaElement(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 25.px),
                id = "message-textarea",
                text = "Message *",
                isRequired = true
            )
            InputSubmitElement(
                onSubmit = { event ->
                    message = (document.getElementById("message-textarea") as HTMLTextAreaElement).value
                    println(message)
                    event.preventDefault()
                },
                value = "Send message"
            )
        }
    }
}