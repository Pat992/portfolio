package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.wrappers.SectionWrapper
import com.pat.portfolio.components.indexPage.contactSection.ContactContent
import com.pat.portfolio.models.Section

@Composable
fun ContactSection() {
    SectionWrapper(
        section = Section.Contact,
    ) {
        ContactContent()
    }
}