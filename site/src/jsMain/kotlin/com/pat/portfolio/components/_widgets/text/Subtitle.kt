package com.pat.portfolio.components._widgets.text

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.FontSizes.SUBTITLE_SIZE
import com.pat.portfolio.core.constants.FontSizes.SUBTITLE_SIZE_SMALL
import com.pat.portfolio.core.styles.titleText
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
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
        attrs = Modifier
            .padding(0.px)
            .margin(0.px)
            .titleText()
            .fontWeight(FontWeight.Normal)
            .fontSize(if (breakpoint >= Breakpoint.LG) SUBTITLE_SIZE else SUBTITLE_SIZE_SMALL)
            .then(modifier)
            .toAttrs()
    ) {
        Text(text)
    }
}