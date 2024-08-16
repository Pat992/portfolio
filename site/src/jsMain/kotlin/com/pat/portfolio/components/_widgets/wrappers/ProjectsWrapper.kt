package com.pat.portfolio.components._widgets.wrappers

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.SectionTitle
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Section

@Composable
fun ProjectsWrapper(
    modifier: Modifier = Modifier,
    project: SubProjects,
    content: @Composable () -> Unit
) {
    Section(
        attrs = modifier
            .zIndex(1)
            .padding(top = 100.px)
            .id(project.id)
            .classNames("section")
            .fillMaxWidth()
            .minHeight(100.vh)
            .toAttrs()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            SectionTitle(
                id = project.id,
                title = project.title
            )
            content()
        }
    }
}