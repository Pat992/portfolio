package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import org.jetbrains.compose.web.css.px

@Composable
fun Tools(subProject: SubProjects) {
    Column {
        if (subProject.technologies.isNotEmpty()) {
            Subtitle(
                modifier = Modifier.margin(bottom = 25.px),
                text = "Technologies"
            )
            subProject.technologies.forEach { technology ->
                ToolLinkItem(iconLink = technology)
            }
        }
    }
}