package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.SectionWrapper
import com.pat.portfolio.components.eductationSection.EducationContent
import com.pat.portfolio.models.Section

@Composable
fun EducationSection() {
    SectionWrapper(
        section = Section.Education
    ) {
        EducationContent()
    }
}