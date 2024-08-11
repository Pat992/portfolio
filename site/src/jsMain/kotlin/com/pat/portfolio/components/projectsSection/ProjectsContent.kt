package com.pat.portfolio.components.projectsSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.models.Projects
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns

@Composable
fun ProjectsContent() {
    SimpleGrid(
        modifier = Modifier
            .fillMaxSize()
            .styleModifier {
                property("grid-gap", "15px")
            },
        numColumns = numColumns(base = 1, md = 3),
    ) {
        Projects.entries.forEach { project ->
            ProjectCard(
                project = project
            )
        }
    }
}