package com.pat.portfolio.components.contactSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.SecondaryCard
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun ContactContent() {
    SecondaryCard(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 25.px)
    ) {
        ContactForm()
    }
}