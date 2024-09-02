package com.pat.portfolio.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.pat.portfolio.components._widgets.loading.LoadingSpinner
import com.pat.portfolio.components._widgets.navigation.BurgerNavModal
import com.pat.portfolio.components._widgets.navigation.Navigation
import com.pat.portfolio.components._widgets.navigation.NavigationItem
import com.pat.portfolio.components._widgets.wrappers.PageWrapper
import com.pat.portfolio.core.utils.ObserveViewport
import com.pat.portfolio.models.Section
import com.pat.portfolio.observables.GithubObservable
import com.pat.portfolio.observables.RequestStatus
import com.pat.portfolio.observables.ViewportDataObservable
import com.pat.portfolio.repositories.githubRepositoryGetLanguages
import com.pat.portfolio.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.core.Page
import kotlinx.browser.window

@Page
@Composable
fun HomePage() {
    LaunchedEffect(Unit) {
        // If the user comes from the projects, the project section needs to be active
        if (ViewportDataObservable.hasVisitedProjects) {
            ViewportDataObservable.hasVisitedProjects = false
            ViewportDataObservable.sectionId = Section.Projects.id
        }

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
    BurgerNavModal(navigationItems = {
        Section
            .entries
            .filter { entry -> entry != Section.Footer }
            .forEach { section ->
                NavigationItem(section)
            }
    })
    if (GithubObservable.requestStatus == RequestStatus.LOADING) LoadingSpinner()
    else
        PageWrapper {
            Navigation(navigationItems = {
                Section
                    .entries
                    .filter { entry ->
                        entry != Section.Main &&
                                entry != Section.Footer &&
                                entry != Section.Contact
                    }
                    .forEach { section ->
                        if (section.ordinal == (Section.entries.size) / 2)
                            Box()
                        NavigationItem(section)
                    }
            })
            MainSection()
            if (GithubObservable.requestStatus == RequestStatus.SUCCESS) LanguagesSection()
            ProjectsSection()
            WorkSection()
            EducationSection()
            ContactSection()
            FooterSection()
        }
}
