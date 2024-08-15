package com.pat.portfolio.pages

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.MouseFollowingGradient
import com.pat.portfolio.components._widgets.Navigation
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.core.utils.ObserveViewport
import com.pat.portfolio.core.utils.ObserveViewportData
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
    ObserveViewport(
        threshold = window.innerHeight * 0.5,
        onScrollChanged = { elementId ->
            ObserveViewportData.sectionId = elementId
        },
        onScrollPercentageChanged = { scrollPercentage ->
            ObserveViewportData.scrollPercentage = scrollPercentage
        },
        onMousePositionChanged = { posY, posX ->
            ObserveViewportData.mousePositionY = posY
            ObserveViewportData.mousePositionX = posX
        }
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Theme.BackgroundColor.rgb)
            .overflow(Overflow.Hidden),
        contentAlignment = Alignment.Center
    ) {
        MouseFollowingGradient()
        Column(
            modifier = Modifier.fillMaxWidth(90.percent)
        ) {
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

}
