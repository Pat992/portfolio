package com.pat.portfolio.components.mainSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.Font.MAIN_SUBTITLE_SIZE
import com.pat.portfolio.core.constants.Font.MAIN_SUBTITLE_SIZE_LARGE
import com.pat.portfolio.core.constants.Font.MAIN_SUBTITLE_SIZE_SMALL
import com.pat.portfolio.core.styles.titleText
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.letterSpacing
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSubtitle(
    breakpoint: Breakpoint
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
            .letterSpacing(1.5.cssRem)
            .toAttrs()
    ) {
        Text("PATRICK HETTICH")
    }
}