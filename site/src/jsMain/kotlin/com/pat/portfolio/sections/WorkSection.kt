package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.wrappers.SectionWrapper
import com.pat.portfolio.components.indexPage.workSection.WorkContent
import com.pat.portfolio.models.Section

@Composable
fun WorkSection() {
    SectionWrapper(
        section = Section.Work
    ) {
        WorkContent()
    }
}