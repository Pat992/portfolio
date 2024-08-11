package com.pat.portfolio.components._widgets.inputs

import androidx.compose.runtime.Composable
import androidx.compose.web.events.SyntheticMouseEvent
import com.pat.portfolio.core.styles.primaryButton
import com.pat.portfolio.core.styles.titleText
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.silk.components.forms.Input
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Text

@Composable
fun InputSubmitElement(
    modifier: Modifier = Modifier,
    value: String,
    onSubmit: (SyntheticMouseEvent) -> Unit
) {
    Input(
        modifier = modifier
            .primaryButton()
            .titleText()
            .cursor(Cursor.Pointer)
            .attrsModifier {
                attr("value", value)
            }
            .onClick { event -> onSubmit(event) },
        type = InputType.Submit,
        value = Text(""),
        onValueChange = { }
    )
}