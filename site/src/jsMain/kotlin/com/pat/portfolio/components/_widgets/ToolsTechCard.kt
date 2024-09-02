package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.buttons.HorizontalLinkItem
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.IconLinks
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.px

@Composable
fun ToolsTechCard(
    description: String? = null,
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
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                if (description != null)
                    Card(
                        modifier = Modifier
                            .padding(all = 15.px)
                            .margin(bottom = 25.px),
                        content = {
                            Paragraph(text = description)
                        }
                    )
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .flexWrap(FlexWrap.Wrap)
        ) {
            iconLinks.forEach {
                Box(
                    modifier = Modifier.width(150.px)
                ) {
                    HorizontalLinkItem(it)
                }
            }
        }
    }
}