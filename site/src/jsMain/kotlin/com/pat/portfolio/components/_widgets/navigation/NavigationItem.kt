package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.NavItemStyle
import com.pat.portfolio.core.styles.glass
import com.pat.portfolio.core.styles.link
import com.pat.portfolio.models.Section
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun NavigationItem(section: Section) {
    val isCurrentSection = ViewportDataObservable.sectionId == section.id
    Box(
        modifier = Modifier
            .thenIf(
                condition = isCurrentSection,
                Modifier.glass()
            )
            .padding(all = 10.px)
            .borderRadius(20.px)
    ) {
        Link(
            modifier = NavItemStyle
                .toModifier()
                .width(250.px)
                .textAlign(TextAlign.Center)
                .link(),
            path = section.path,
            text = section.title
        )
    }
}
