package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.glass
import com.pat.portfolio.core.styles.link
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Navigation() {
    Row(
        modifier = Modifier
            .zIndex(100)
            .glass()
            .padding(all = 16.px)
            .margin(top = 20.px)
            .fillMaxWidth(90.percent)
            .position(Position.Fixed),
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

@Composable
private fun NavigationItem(section: Section) {
    Link(
        modifier = Modifier.link(),
        path = section.path,
        text = section.title
    )
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