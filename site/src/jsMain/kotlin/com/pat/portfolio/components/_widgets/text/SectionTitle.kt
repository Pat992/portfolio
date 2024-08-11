package com.pat.portfolio.components._widgets.text

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.Font.SUBTITLE_SIZE
import com.pat.portfolio.core.constants.Font.SUBTITLE_SIZE_SMALL
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.core.styles.titleText
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionTitle(
    section: Section,
    onViewportEntered: Boolean = false
) {
    val breakpoint = rememberBreakpoint()
    Column {
        H3(
            attrs = Modifier
                .padding(0.px)
                .margin(bottom = 50.px)
                .titleText()
                .fontSize(if (breakpoint >= Breakpoint.MD) SUBTITLE_SIZE else SUBTITLE_SIZE_SMALL)
                .toAttrs(),
        ) {
            Text(section.title)
            Box(
                modifier = Modifier
                    .width(if (!onViewportEntered) 0.percent else 100.percent)
                    .height(5.px)
                    .backgroundImage(
                        linearGradient(
                            LinearGradient.Direction.ToRight,
                            Theme.HighlightColor3.rgb,
                            Theme.HighlightColor4.rgb
                        )
                    )
                    .backgroundColor(Theme.MainTextColor.rgb)
                    .transition(Transition.of("width", duration = 500.ms))
            )
        }
    }
}