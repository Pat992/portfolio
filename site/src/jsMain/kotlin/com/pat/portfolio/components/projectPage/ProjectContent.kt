package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components.indexPage.mainSection.MainSubtitle
import com.pat.portfolio.models.Projects
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint

@Composable
fun ProjectContent(project: Projects) {
    val breakpoint = rememberBreakpoint()
    var colorIndex = 6
    MainSubtitle(
        modifier = Modifier.zIndex(1),
        title = project.title,
        breakpoint = breakpoint
    )
    project.projects.forEach { subProject ->
        if (colorIndex >= 9) colorIndex = 6
        else colorIndex += 1
        ProjectItem(
            subProject = subProject,
            colorIndex = colorIndex
        )
    }
}