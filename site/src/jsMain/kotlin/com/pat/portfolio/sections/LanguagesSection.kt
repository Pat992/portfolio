package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.wrappers.SectionWrapper
import com.pat.portfolio.components.indexPage.languagesSection.LanguagesContent
import com.pat.portfolio.models.Section

@Composable
fun LanguagesSection() {
    SectionWrapper(
        section = Section.Languages,
    ) {
        LanguagesContent()
    }
}