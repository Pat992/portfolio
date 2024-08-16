package com.pat.portfolio.components.indexPage.footerSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.GlassCard
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.models.IconLinks
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.px
import kotlin.js.Date

@Composable
fun FooterContent() {
    GlassCard(
        modifier = Modifier
            .padding(all = 25.px)
            .bottom((-5).px)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Top
        ) {
            Column {
                Subtitle(text = "Ⓒ ${Date(Date.now()).getFullYear()} Patrick Hettich")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Subtitle(modifier = Modifier.margin(bottom = 25.px), text = "Built with")
                FooterLinkItem(IconLinks.Kotlin)
                FooterLinkItem(IconLinks.Kobweb)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Subtitle(modifier = Modifier.margin(bottom = 25.px), text = "Contact")
                FooterLinkItem(IconLinks.Github)
                FooterLinkItem(IconLinks.Linkedin)
            }
        }
    }
}