package com.pat.portfolio.components._widgets.inputs

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.Font.PARAGRAPH_SIZE
import com.pat.portfolio.core.constants.Font.PARAGRAPH_SIZE_SMALL
import com.pat.portfolio.core.styles.glass
import com.pat.portfolio.core.styles.paragraphText
import com.pat.portfolio.core.styles.titleText
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.forms.Input
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.Text

@Composable
fun InputElement(
    modifier: Modifier = Modifier,
    text: String,
    value: String,
    inputType: InputType.InputTypeWithStringValue = InputType.Text,
    onValueChange: (String) -> Unit,
    isRequired: Boolean = false
) {
    val breakpoint = rememberBreakpoint()
    Label(
        attrs = Modifier
            .fillMaxWidth()
            .paragraphText()
            .toAttrs()
    ) {
        Text(text)
        Br()
        Input(
            modifier = modifier
                .titleText()
                .fontSize(if (breakpoint >= Breakpoint.MD) PARAGRAPH_SIZE else PARAGRAPH_SIZE_SMALL)
                .glass()
                .attrsModifier {
                    if (isRequired)
                        attr("required", "true")
                },
            type = inputType,
            value = value,
            onValueChange = { value -> onValueChange(value) }
        )
    }
}