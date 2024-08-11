package com.pat.portfolio.components._widgets

import androidx.compose.runtime.*
import com.pat.portfolio.components._widgets.text.SectionTitle
import com.pat.portfolio.core.utils.ObserveViewportEntered
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun SectionWrapper(
    modifier: Modifier = Modifier,
    section: Section,
    content: @Composable (Boolean) -> Unit
) {
    var onViewportEntered by remember { mutableStateOf(false) }
    ObserveViewportEntered(
        id = section.id,
        threshold = 500.0,
        onViewportEntered = {
            onViewportEntered = true
        },
        onViewportLeft = {
            onViewportEntered = false
        }
    )

    Box(
        modifier = modifier
            .padding(top = 100.px)
            .id(section.id)
            .classNames("section")
            .fillMaxWidth()
            .minHeight(100.vh)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            SectionTitle(
                section = section,
                onViewportEntered = onViewportEntered
            )
            content(onViewportEntered)
        }
    }
}