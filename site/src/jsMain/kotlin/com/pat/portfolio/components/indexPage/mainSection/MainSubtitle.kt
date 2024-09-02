package com.pat.portfolio.components.indexPage.mainSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.FontSizes.MAIN_SUBTITLE_SIZE
import com.pat.portfolio.core.constants.FontSizes.MAIN_SUBTITLE_SIZE_LARGE
import com.pat.portfolio.core.constants.FontSizes.MAIN_SUBTITLE_SIZE_SMALL
import com.pat.portfolio.core.styles.titleText
import com.varabyte.kobweb.compose.css.BackgroundClip
import com.varabyte.kobweb.compose.css.BackgroundSize
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSubtitle(
    breakpoint: Breakpoint,
    title: String,
    modifier: Modifier = Modifier
) {
    H2(
        attrs = Modifier
            .titleText()
            .width(100.percent)
            .fontSize(
                when {
                    breakpoint >= Breakpoint.LG -> MAIN_SUBTITLE_SIZE_LARGE
                    breakpoint >= Breakpoint.MD -> MAIN_SUBTITLE_SIZE
                    else -> MAIN_SUBTITLE_SIZE_SMALL
                }
            )
            .letterSpacing(if (breakpoint >= Breakpoint.MD) 1.5.cssRem else 1.2.cssRem)
            .display(DisplayStyle.InlineBlock)
            .backgroundSize(BackgroundSize.of(100.percent))
            .backgroundClip(BackgroundClip.Text)
            .backgroundImage(url = url("/images/text/text-gradient.svg"))
            .styleModifier {
//                property("background", "url(\"/images/text/text-gradient.svg\")")
                property("-webkit-text-fill-color", "transparent")
            }
            .then(modifier)
            .toAttrs()
    ) {
        Text(title)
    }
}