package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.HorizontalRule
import com.pat.portfolio.components._widgets.buttons.VerticalLinkItem
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.models.IconLinks
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Tools(subProject: SubProjects) {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        ToolsItem(
            title = "Technologies",
            iconLinks = subProject.technologies
        )
        HorizontalRule(
            modifier = Modifier.fillMaxWidth(if (breakpoint >= Breakpoint.MD) 90.percent else 100.percent)
        )
        ToolsItem(
            title = "Tools",
            iconLinks = subProject.tools
        )
        HorizontalRule(
            modifier = Modifier.fillMaxWidth(if (breakpoint >= Breakpoint.MD) 90.percent else 100.percent)
        )
    }
}

@Composable
private fun ToolsItem(
    title: String,
    iconLinks: List<IconLinks>
) {
    Subtitle(
        modifier = Modifier.margin(bottom = 15.px),
        text = title
    )
    Row(
        modifier = Modifier.fillMaxWidth(),
    ) {
        iconLinks.forEach { iconLink ->
            VerticalLinkItem(iconLink = iconLink)
        }
    }
}