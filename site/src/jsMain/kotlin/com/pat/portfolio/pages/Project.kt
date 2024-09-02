package com.pat.portfolio.pages

import androidx.compose.runtime.*
import com.pat.portfolio.components._widgets.navigation.Navigation
import com.pat.portfolio.components._widgets.wrappers.PageWrapper
import com.pat.portfolio.components.projectPage.ProjectContent
import com.pat.portfolio.core.utils.ObserveViewport
import com.pat.portfolio.models.Projects
import com.pat.portfolio.observables.ViewportDataObservable
import com.pat.portfolio.sections.FooterSection
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import kotlinx.browser.window

@Page("portfolio/project")
@Composable
fun ProjectPage() {
    val context = rememberPageContext()
    val projectId = context.route.params["id"]
    var project: Projects? by remember { mutableStateOf(null) }

    LaunchedEffect(Unit) {
        ViewportDataObservable.hasVisitedProjects = true
        project = Projects.entries.firstOrNull { it.id == projectId }
        if (project == null) {
            context.router.navigateTo("/")
        }
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
        Navigation(navigationItems = {}, showBurgerMenu = false)
        if (project != null) {
            ProjectContent(project = project!!)
        }
        FooterSection()
    }
}