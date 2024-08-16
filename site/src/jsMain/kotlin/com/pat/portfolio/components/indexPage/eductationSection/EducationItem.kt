package com.pat.portfolio.components.indexPage.eductationSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ExperienceItem
import com.pat.portfolio.models.Education
import com.pat.portfolio.models.Section

@Composable
fun EducationItem(
    education: Education,
    index: Int
) {
    ExperienceItem(
        title = education.school,
        subtitle = education.educationTitle,
        dateFrom = education.dateFrom,
        dateTo = education.dateTo,
        index = index,
        section = Section.Education
    )
}