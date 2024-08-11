package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.SectionWrapper
import com.pat.portfolio.components.languagesSection.LanguagesContent
import com.pat.portfolio.core.utils.ObserveViewportEntered
import com.pat.portfolio.models.Section

@Composable
fun LanguagesSection() {

    ObserveViewportEntered(
        id = Section.Languages.id,
        threshold = 500.0,
        onViewportEntered = {},
        onViewportLeft = {}
    )

    SectionWrapper(
        section = Section.Languages
    ) {
        LanguagesContent()
    }
}