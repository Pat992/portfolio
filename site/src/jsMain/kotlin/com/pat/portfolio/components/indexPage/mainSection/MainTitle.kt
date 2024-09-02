package com.pat.portfolio.components.indexPage.mainSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.FontSizes.MAIN_TITLE_SIZE
import com.pat.portfolio.core.constants.FontSizes.MAIN_TITLE_SIZE_SMALL
import com.pat.portfolio.core.styles.MainSectionTitleStyle
import com.pat.portfolio.core.styles.titleText
import com.varabyte.kobweb.compose.css.CSSFloat
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.times
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

@Composable
fun MainTitle(
    breakpoint: Breakpoint
) {
    Box(

    ) {
        H1(
            attrs = MainSectionTitleStyle
                .toModifier()
                .padding(0.px)
                .margin(0.px)
                .fontSize(if (breakpoint >= Breakpoint.MD) MAIN_TITLE_SIZE else MAIN_TITLE_SIZE_SMALL)
                .titleText()
                .toAttrs()
        ) {
            SpanText("DEVELOPER - ")
            Box(
                modifier = Modifier
                    .id("main-title-extension")
                    .overflow(Overflow.Hidden)
                    .position(Position.Relative)
                    .float(CSSFloat.Right)
                    .height(
                        if (breakpoint >= Breakpoint.MD) MAIN_TITLE_SIZE.times(1.5) else MAIN_TITLE_SIZE_SMALL.times(
                            1.5
                        )
                    )
            ) {
                Ul(
                    attrs = Modifier
                        .padding(left = 0.px)
                        .toAttrs()
                ) {
                    MainTitleItem(text = "WEB")
                    MainTitleItem(text = "MOBILE")
                    MainTitleItem(text = "DATA INTEGRATION")
                }
            }
        }
    }
}

@Composable
private fun MainTitleItem(
    text: String
) {
    Li(
        attrs = Modifier
            .display(DisplayStyle.Block)
            .height(90.px)
            .toAttrs()
    ) {
        Text(text)
    }
}