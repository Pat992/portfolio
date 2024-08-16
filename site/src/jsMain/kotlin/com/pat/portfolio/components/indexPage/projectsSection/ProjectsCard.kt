package com.pat.portfolio.components.indexPage.projectsSection

import androidx.compose.runtime.*
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.svgs.SvgElement
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.Projects
import com.pat.portfolio.models.Section
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
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
) {
    val context = rememberPageContext()
    val breakpoint = rememberBreakpoint()
    val onViewportEntered = ViewportDataObservable.sectionId == Section.Projects.id
    var svgColor by remember { mutableStateOf(Theme.SecondaryTextColor.hex) }
    Box(
        modifier = Modifier
            .cursor(Cursor.Pointer)
            .onMouseEnter { svgColor = Theme.HighlightColor4.hex }
            .onMouseLeave { svgColor = Theme.SecondaryTextColor.hex }
            .onClick {
                context.router.navigateTo("/project?id=${project.id}")
            }
    ) {
        Card(
            modifier = Modifier
                .padding(all = 25.px)
                .fillMaxWidth(),
            theme = Theme.HighlightColor2,
            content = {
                Column(
                    modifier = Modifier.textAlign(TextAlign.Center),
                    verticalArrangement = Arrangement.Center
                ) {
                    SvgElement(
                        path = project.svgPath,
                        height = if (breakpoint >= Breakpoint.MD) 250.0 else 100.0,
                        width = if (breakpoint >= Breakpoint.MD) 250.0 else 100.0,
                        color = svgColor,
                        viewBoxValue = if (project == Projects.Mobile) "0 0 512 512" else "0 -960 960 960",
                        modifier = Modifier
                            .margin(bottom = 50.px)
                            .fillMaxWidth()
                    )
                    Subtitle(
                        modifier = Modifier.margin(bottom = 50.px).fillMaxWidth(),
                        text = project.title
                    )
                    Paragraph(
                        modifier = Modifier.fillMaxWidth(),
                        text = project.shortDescription
                    )
                }
            }
        )
        Box(
            modifier = Modifier
                .backgroundColor(Theme.BackgroundColor.rgb)
                .zIndex(1)
                .fillMaxHeight()
                .width(if (!onViewportEntered) 100.percent else 0.percent)
                .transition(Transition.of("width", duration = 500.ms, delay = 100.ms * index))
        )
    }
}