package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.SectionWrapper
import com.pat.portfolio.components.projectsSection.ProjectsContent
import com.pat.portfolio.models.Section

@Composable
fun ProjectsSection() {
    SectionWrapper(
        section = Section.Projects
    ) {
        ProjectsContent()
    }
}