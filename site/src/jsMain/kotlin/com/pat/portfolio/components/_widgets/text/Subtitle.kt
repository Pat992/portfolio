package com.pat.portfolio.components._widgets.text

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.Font.SUBTITLE_SIZE
import com.pat.portfolio.core.constants.Font.SUBTITLE_SIZE_SMALL
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.core.styles.paragraphText
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Text

@Composable
fun Subtitle(
    text: String,
    modifier: Modifier = Modifier
) {
    val breakpoint = rememberBreakpoint()
    H4(
        attrs = modifier
            .padding(0.px)
            .margin(0.px)
            .paragraphText()
            .color(Theme.SecondaryTextColor.rgb)
            .fontWeight(FontWeight.Normal)
            .fontSize(if (breakpoint >= Breakpoint.MD) SUBTITLE_SIZE else SUBTITLE_SIZE_SMALL)
            .toAttrs()
    ) {
        Text(text)
    }
}