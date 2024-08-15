package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.glass
import com.pat.portfolio.core.styles.linearGradient
import com.pat.portfolio.models.Section
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Nav

@Composable
fun Navigation() {
    Nav(
        attrs = Modifier
            .zIndex(50)
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
                    .width((ViewportDataObservable.scrollPercentage * 100).percent)
                    .linearGradient()
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(topBottom = 10.px),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
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