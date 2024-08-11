package com.pat.portfolio.components._widgets.text

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.Font.PARAGRAPH_SIZE
import com.pat.portfolio.core.constants.Font.PARAGRAPH_SIZE_SMALL
import com.pat.portfolio.core.styles.paragraphText
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Paragraph(
    text: String,
    modifier: Modifier = Modifier
) {
    val breakpoint = rememberBreakpoint()
    P(
        attrs = modifier
            .padding(0.px)
            .margin(0.px)
            .paragraphText()
            .fontSize(if (breakpoint >= Breakpoint.MD) PARAGRAPH_SIZE else PARAGRAPH_SIZE_SMALL)
            .toAttrs()
    ) {
        Text(text)
    }
}