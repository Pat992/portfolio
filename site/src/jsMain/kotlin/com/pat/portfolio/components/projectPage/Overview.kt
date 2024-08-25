package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import org.jetbrains.compose.web.css.px

@Composable
fun Overview(subProject: SubProjects) {
    Subtitle(
        modifier = Modifier.margin(bottom = 25.px),
        text = "Overview"
    )
    subProject.description.split("|").forEach { part ->
        Paragraph(
            modifier = Modifier.margin(bottom = 15.px),
            text = part
        )
    }
}