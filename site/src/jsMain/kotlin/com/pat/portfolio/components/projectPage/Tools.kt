package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.models.IconLinks
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Hr

@Composable
fun Tools(subProject: SubProjects) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        ToolsItem(
            title = "Technologies",
            iconLinks = subProject.technologies
        )
        Hr(
            attrs = Modifier
                .fillMaxWidth(90.percent)
                .margin(topBottom = 25.px)
                .toAttrs()
        )
        ToolsItem(
            title = "Tools",
            iconLinks = subProject.tools
        )
        Hr(
            attrs = Modifier
                .fillMaxWidth(90.percent)
                .margin(topBottom = 25.px)
                .toAttrs()
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
            ToolLinkItem(iconLink = iconLink)
        }
    }
}