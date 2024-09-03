package com.pat.portfolio.components._widgets.inputs

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.FontSizes.PARAGRAPH_SIZE
import com.pat.portfolio.core.constants.FontSizes.PARAGRAPH_SIZE_SMALL
import com.pat.portfolio.core.styles.glass
import com.pat.portfolio.core.styles.paragraphText
import com.pat.portfolio.core.styles.titleText
import com.varabyte.kobweb.compose.css.Resize
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.TextArea

@Composable
fun TextareaElement(
    modifier: Modifier = Modifier,
    id: String,
    text: String,
    isRequired: Boolean = false
) {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Label(
            attrs = Modifier
                .padding(bottom = 5.px)
                .paragraphText()
                .toAttrs(),
            forId = id
        ) {
            Text(text)
        }
        TextArea(
            attrs = modifier
                .glass()
                .id(id)
                .resize(Resize.None)
                .fontSize(if (breakpoint >= Breakpoint.MD) PARAGRAPH_SIZE else PARAGRAPH_SIZE_SMALL)
                .height(400.px)
                .titleText()
                .padding(leftRight = 15.px, topBottom = 10.px)
                .ariaRequired(isRequired)
                .attrsModifier {
                    if (isRequired)
                        attr("required","")
                }
                .toAttrs(),
        )
    }
}