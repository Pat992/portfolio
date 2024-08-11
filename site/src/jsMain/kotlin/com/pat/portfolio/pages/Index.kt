package com.pat.portfolio.pages

import androidx.compose.runtime.*
import com.pat.portfolio.components._widgets.Navigation
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.core.utils.ObserveViewport
import com.pat.portfolio.models.Section
import com.pat.portfolio.sections.*
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.core.Page
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent

@Page
@Composable
fun HomePage() {
    var sectionViewportEntered by remember { mutableStateOf("home") }
    ObserveViewport(
        threshold = window.innerHeight * 0.5,
        onViewportChanged = { elementId ->
            sectionViewportEntered = elementId
        }
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Theme.BackgroundColor.rgb)
            .overflow(Overflow.Hidden),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(90.percent)
        ) {
            Navigation()
            MainSection(onViewportEntered = sectionViewportEntered == Section.Main.id)
            LanguagesSection(onViewportEntered = sectionViewportEntered == Section.Languages.id)
            ProjectsSection(onViewportEntered = sectionViewportEntered == Section.Projects.id)
            WorkSection(onViewportEntered = sectionViewportEntered == Section.Work.id)
            EducationSection(onViewportEntered = sectionViewportEntered == Section.Education.id)
            ContactSection(onViewportEntered = sectionViewportEntered == Section.Contact.id)
            FooterSection()
        }
    }

}
