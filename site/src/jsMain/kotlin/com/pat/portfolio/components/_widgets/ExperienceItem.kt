package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.components._widgets.text.Title
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.core.utils.ObserveSection
import com.pat.portfolio.models.Section
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
    title: String,
    subtitle: String,
    dateFrom: Date,
    dateTo: Date?,
    index: Int,
    section: Section
) {
    val breakpoint = rememberBreakpoint()
    val onViewportEntered = ObserveSection.sectionId == section.id
    Row(
        modifier = Modifier.height(
            when {
                breakpoint > Breakpoint.LG -> 120.px
                breakpoint >= Breakpoint.SM -> 160.px
                else -> 100.px
            }
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
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
                    .backgroundColor(Theme.SecondaryColor.rgb)
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
                    .backgroundColor(Theme.SecondaryColor.rgb)
                    .fillMaxHeight()
            )
        }
        SimpleGrid(
            modifier = Modifier.alignContent(AlignContent.Center),
            numColumns = numColumns(base = 1, xl = 2)
        ) {
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Paragraph(
                    modifier = Modifier.width(if (breakpoint >= Breakpoint.MD) 500.px else 150.px),
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
                Column(
                    modifier = Modifier.width(if (breakpoint >= Breakpoint.LG) 70.percent else if (breakpoint >= Breakpoint.MD) 50.percent else 100.percent)
                ) {
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