package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.IconLinks
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.order
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
            .order(if (breakpoint < Breakpoint.MD) 1 else -1),
        theme = Theme.HighlightColor3,
        content = {
        }
    )
}