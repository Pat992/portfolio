package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.link
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.navigation.Link

@Composable
fun NavigationHomeItem() {
    val section = Section.Main
    Link(
        modifier = Modifier.link(),
        path = section.path,
        text = section.title
    )
}