package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.buttons.HorizontalLinkItem
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.IconLinks
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.order
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun ToolsTechCard(
    technologies: List<IconLinks>,
    tools: List<IconLinks>
) {
    val breakpoint = rememberBreakpoint()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .margin(bottom = 25.px)
            .padding(all = 15.px)
            .order(if (breakpoint < Breakpoint.LG) 1 else -1),
        theme = Theme.HighlightColor3,
        content = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ToolsTechCardGrid(
                    title = "Technologies",
                    iconLinks = technologies
                )
                ToolsTechCardGrid(
                    title = "Tools",
                    iconLinks = tools
                )
            }
        }
    )
}

@Composable
private fun ToolsTechCardGrid(
    title: String,
    iconLinks: List<IconLinks>
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Subtitle(
            text = title,
            modifier = Modifier.margin(bottom = 25.px)
        )
        SimpleGrid(
            numColumns = numColumns(base = 2)
        ) {
            iconLinks.forEach { HorizontalLinkItem(it) }
        }
    }
}