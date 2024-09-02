package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.wrappers.SectionWrapper
import com.pat.portfolio.components.indexPage.projectsSection.ProjectsContent
import com.pat.portfolio.models.Section

@Composable
fun ProjectsSection() {
    SectionWrapper(
        section = Section.Projects
    ) {
        ProjectsContent()
    }
}