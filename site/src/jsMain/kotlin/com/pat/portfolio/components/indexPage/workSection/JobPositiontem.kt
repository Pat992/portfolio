package com.pat.portfolio.components.indexPage.workSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ExperienceItem
import com.pat.portfolio.models.Position
import com.pat.portfolio.models.Section
import com.pat.portfolio.models.WorkExperience

@Composable
fun JobPositionItem(
    showCompany: Boolean,
    workExperience: WorkExperience,
    position: Position,
    index: Int
) {
    ExperienceItem(
        showCompany = showCompany,
        title = workExperience.companyName,
        subtitle = position.jobTitle,
        dateFrom = position.dateFrom,
        dateTo = position.dateTo,
        index = index,
        section = Section.Work
    )
}