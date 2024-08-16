package com.pat.portfolio.components.indexPage.workSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ExperienceItem
import com.pat.portfolio.models.Section
import com.pat.portfolio.models.WorkExperience

@Composable
fun WorkItem(
    workExperience: WorkExperience,
    index: Int
) {
    ExperienceItem(
        title = workExperience.companyName,
        subtitle = workExperience.jobTitle,
        dateFrom = workExperience.dateFrom,
        dateTo = workExperience.dateTo,
        index = index,
        section = Section.Work
    )
}