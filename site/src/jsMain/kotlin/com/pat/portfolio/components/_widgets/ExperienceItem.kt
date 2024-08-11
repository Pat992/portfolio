package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.components._widgets.text.Title
import com.pat.portfolio.core.styles.Theme
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import kotlin.js.Date

@Composable
fun ExperienceItem(
    title: String,
    subtitle: String,
    dateFrom: Date,
    dateTo: Date?
) {
    val breakpoint = rememberBreakpoint()
    Row(
        modifier = Modifier.minHeight(150.px),
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
                    .backgroundColor(Theme.SecondaryColor.rgb)
                    .size(25.px)
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

        Paragraph(
            modifier = Modifier.width(if (breakpoint >= Breakpoint.MD) 200.px else 150.px),
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
        Column(
            modifier = Modifier.width(50.percent)
        ) {
            Title(modifier = Modifier.textAlign(TextAlign.Left), text = title)
            Subtitle(modifier = Modifier.textAlign(TextAlign.Left), text = subtitle)
        }
    }
}