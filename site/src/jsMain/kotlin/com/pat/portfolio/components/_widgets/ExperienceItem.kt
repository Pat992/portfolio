package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.components._widgets.text.Title
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.Section
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import kotlin.js.Date

@Composable
fun ExperienceItem(
    modifier: Modifier = Modifier,
    showCompany: Boolean = true,
    title: String,
    subtitle: String,
    dateFrom: Date,
    dateTo: Date?,
    index: Int,
    section: Section
) {
    val breakpoint = rememberBreakpoint()
    val onViewportEntered = ViewportDataObservable.sectionId == section.id
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.percent)
            .then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint > Breakpoint.MD) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .margin(right = 15.px),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .backgroundColor(Colors.Transparent)
                        .size(25.px)
                        .borderRadius(50.percent)
                )
                Box(
                    modifier = Modifier
                        .backgroundColor(Theme.HighlightColor1.rgb)
                        .size(if (!onViewportEntered) 0.px else 25.px)
                        .transition(
                            Transition.of(
                                TransitionProperty.All.toString(),
                                duration = 500.ms,
                                delay = 100.ms * index,
                            )
                        )
                        .borderRadius(50.percent)
                )
                Box(
                    modifier = Modifier
                        .width(1.px)
                        .margin(0.px)
                        .padding(0.px)
                        .backgroundColor(Theme.HighlightColor1.rgb)
                        .fillMaxHeight()
                )
            }
        }
        SimpleGrid(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = if (breakpoint > Breakpoint.MD) 0.px else 15.px)
                .alignContent(AlignContent.SpaceBetween),
            numColumns = numColumns(base = 1, xl = 2)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .order(if (breakpoint < Breakpoint.LG) 1 else -1),
                contentAlignment = Alignment.CenterStart
            ) {
                Paragraph(
                    text = "${
                        dateFrom.toLocaleDateString(window.navigator.language, options = dateLocaleOptions {
                            year = "numeric"
                            month = "2-digit"
                        })
                    } - ${
                        dateTo?.toLocaleDateString(window.navigator.language, options = dateLocaleOptions {
                            year = "numeric"
                            month = "2-digit"
                        }) ?: "Now"
                    }"
                )
                Box(
                    modifier = Modifier
                        .backgroundColor(Theme.BackgroundColor.rgb)
                        .fillMaxHeight()
                        .width(if (!onViewportEntered) 100.percent else 0.percent)
                        .transition(Transition.of("width", duration = 200.ms, delay = 100.ms * (index * 1.25)))
                )
            }
            Box {
                Column {
                    if (breakpoint > Breakpoint.MD || showCompany)
                        Title(modifier = Modifier.textAlign(TextAlign.Left), text = title)
                    Subtitle(modifier = Modifier.textAlign(TextAlign.Left), text = subtitle)
                }
                Box(
                    modifier = Modifier
                        .backgroundColor(Theme.BackgroundColor.rgb)
                        .fillMaxHeight()
                        .width(if (!onViewportEntered) 100.percent else 0.percent)
                        .transition(Transition.of("width", duration = 200.ms, delay = 100.ms * (index * 1.5)))
                )
            }
        }
    }
}