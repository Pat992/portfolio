package com.pat.portfolio.components.indexPage.workSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ExperienceItem
import com.pat.portfolio.models.Position
import com.pat.portfolio.models.Section
import com.pat.portfolio.models.WorkExperience

@Composable
fun JobPositionItem(
    workExperience: WorkExperience,
    position: Position,
    index: Int
) {
    ExperienceItem(
        title = workExperience.companyName,
        subtitle = position.name,
        dateFrom = position.dateFrom,
        dateTo = position.dateTo,
        index = index,
        section = Section.Work
    )
}