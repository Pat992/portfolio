package com.pat.portfolio.components.footerSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.GlassCard
import com.pat.portfolio.components._widgets.text.Paragraph
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.bottom
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun FooterContent() {
    GlassCard(
        modifier = Modifier
            .padding(all = 25.px)
            .bottom((-5).px)
            .fillMaxWidth()
    ) {
        Column {
            Row {
                Paragraph("Link 1")
                Paragraph("Link 2")
            }
            Paragraph(text = "Made with ...")
        }
    }
}