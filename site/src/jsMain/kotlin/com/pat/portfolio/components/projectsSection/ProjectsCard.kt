package com.pat.portfolio.components.projectsSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.svgs.SvgWidget
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.Projects
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import org.jetbrains.compose.web.css.px

@Composable
fun ProjectCard(
    project: Projects
) {
    Card(
        modifier = Modifier.padding(all = 25.px)
    ) {
        Column(
            modifier = Modifier.textAlign(TextAlign.Center),
            verticalArrangement = Arrangement.Center
        ) {
            SvgWidget(
                path = project.svgPath,
                height = 250.0,
                width = 250.0,
                color = Theme.SecondaryColor.hex,
                viewBoxValue = if (project == Projects.Mobile) "0 0 512 512" else "0 -960 960 960",
                modifier = Modifier.margin(bottom = 50.px)
            )
            Subtitle(
                modifier = Modifier
                    .fillMaxWidth(),
                text = project.title
            )
        }
    }
}