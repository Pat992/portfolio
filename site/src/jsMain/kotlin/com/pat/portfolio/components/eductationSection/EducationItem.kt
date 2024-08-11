package com.pat.portfolio.components.eductationSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ExperienceItem
import com.pat.portfolio.models.Education

@Composable
fun EducationItem(
    education: Education
) {
    ExperienceItem(
        title = education.school,
        subtitle = education.educationTitle,
        dateFrom = education.dateFrom,
        dateTo = education.dateTo
    )
}