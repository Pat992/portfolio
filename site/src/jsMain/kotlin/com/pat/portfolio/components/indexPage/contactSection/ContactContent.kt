package com.pat.portfolio.components.indexPage.contactSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.core.styles.Theme
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun ContactContent() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 25.px),
        theme = Theme.HighlightColor4,
        content = {
            ContactForm()
        }
    )
}