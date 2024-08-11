package com.pat.portfolio.components.workSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ExperienceItem
import com.pat.portfolio.models.WorkExperience

@Composable
fun WorkItem(
    workExperience: WorkExperience,
    onViewportEntered: Boolean,
    index: Int
) {
    ExperienceItem(
        title = workExperience.companyName,
        subtitle = workExperience.jobTitle,
        dateFrom = workExperience.dateFrom,
        dateTo = workExperience.dateTo,
        onViewportEntered = onViewportEntered,
        index = index
    )
}