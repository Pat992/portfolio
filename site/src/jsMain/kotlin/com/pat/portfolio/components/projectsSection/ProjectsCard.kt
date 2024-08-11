package com.pat.portfolio.components.projectsSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.svgs.SvgWidget
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.Projects
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.times

@Composable
fun ProjectCard(
    project: Projects,
    index: Int,
    onViewportEntered: Boolean = false
) {
    val breakpoint = rememberBreakpoint()
    Box {
        Card(
            modifier = Modifier
                .padding(all = 25.px)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.textAlign(TextAlign.Center),
                verticalArrangement = Arrangement.Center
            ) {
                SvgWidget(
                    path = project.svgPath,
                    height = if (breakpoint >= Breakpoint.MD) 250.0 else 100.0,
                    width = if (breakpoint >= Breakpoint.MD) 250.0 else 100.0,
                    color = Theme.SecondaryColor.hex,
                    viewBoxValue = if (project == Projects.Mobile) "0 0 512 512" else "0 -960 960 960",
                    modifier = Modifier.margin(bottom = 50.px)
                )
                Subtitle(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = project.title
                )
            }
        }
        Box(
            modifier = Modifier
                .backgroundColor(Theme.BackgroundColor.rgb)
                .fillMaxHeight()
                .width(if (!onViewportEntered) 100.percent else 0.percent)
                .transition(Transition.of("width", duration = 500.ms, delay = 100.ms * index))
        )
    }
}