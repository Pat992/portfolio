package com.pat.portfolio.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.pat.portfolio.components._widgets.navigation.Navigation
import com.pat.portfolio.components._widgets.wrappers.PageWrapper
import com.pat.portfolio.core.utils.ObserveViewport
import com.pat.portfolio.observables.GithubObservable
import com.pat.portfolio.observables.RequestStatus
import com.pat.portfolio.observables.ViewportDataObservable
import com.pat.portfolio.repositories.githubRepositoryGetLanguages
import com.pat.portfolio.sections.*
import com.varabyte.kobweb.core.Page
import kotlinx.browser.window

@Page
@Composable
fun HomePage() {
    LaunchedEffect(Unit) {
        if (GithubObservable.requestStatus != RequestStatus.SUCCESS)
            githubRepositoryGetLanguages()
    }

    ObserveViewport(
        threshold = window.innerHeight * 0.5,
        onScrollChanged = { elementId ->
            ViewportDataObservable.sectionId = elementId
        },
        onScrollPercentageChanged = { scrollPercentage ->
            ViewportDataObservable.scrollPercentage = scrollPercentage
        },
        onMousePositionChanged = { posY, posX ->
            ViewportDataObservable.mousePositionY = posY
            ViewportDataObservable.mousePositionX = posX
        }
    )
    PageWrapper {
        Navigation()
        MainSection()
        LanguagesSection()
        ProjectsSection()
        WorkSection()
        EducationSection()
        ContactSection()
        FooterSection()
    }
}
