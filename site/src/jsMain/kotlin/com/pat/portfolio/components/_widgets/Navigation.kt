package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.glass
import com.pat.portfolio.core.styles.linearGradient
import com.pat.portfolio.core.styles.link
import com.pat.portfolio.core.utils.ObserveViewportData
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Nav

@Composable
fun Navigation() {
    Nav(
        attrs = Modifier
            .zIndex(100)
            .glass()
            .borderRadius(50.px)
            .padding(leftRight = 10.px)
            .margin(top = 20.px)
            .fillMaxWidth(90.percent)
            .position(Position.Fixed)
            .toAttrs(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(leftRight = 20.px),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .backgroundColor(Colors.Red)
                    .width((ObserveViewportData.scrollPercentage * 100).percent)
                    .linearGradient()
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(topBottom = 10.px),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Section
                .entries
                .filter { entry ->
                    entry != Section.Main &&
                            entry != Section.Footer &&
                            entry != Section.Contact
                }
                .forEach { section ->
                    if (section.ordinal == (Section.entries.size) / 2)
                        NavigationHomeItem()
                    NavigationItem(section)
                }
        }
    }

}

@Composable
private fun NavigationItem(section: Section) {
    val isCurrentSection = ObserveViewportData.sectionId == section.id
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
            modifier = Modifier
                .width(250.px)
                .textAlign(TextAlign.Center)
                .link(),
            path = section.path,
            text = section.title
        )
    }
}

@Composable
private fun NavigationHomeItem() {
    val section = Section.Main
    Link(
        modifier = Modifier.link(),
        path = section.path,
        text = section.title
    )
}