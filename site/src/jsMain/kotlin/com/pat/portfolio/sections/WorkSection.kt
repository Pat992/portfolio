package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.SectionWrapper
import com.pat.portfolio.components.workSection.WorkContent
import com.pat.portfolio.models.Section

@Composable
fun WorkSection(
    onViewportEntered: Boolean
) {
    SectionWrapper(
        section = Section.Work,
        onViewportEntered = onViewportEntered
    ) {
        WorkContent(
            onViewportEntered = onViewportEntered
        )
    }
}