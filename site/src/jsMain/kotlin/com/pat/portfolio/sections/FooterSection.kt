package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components.indexPage.footerSection.FooterContent
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun FooterSection() {
    Box(
        modifier = Modifier
            .overflow(Overflow.Hidden)
            .margin(topBottom = 25.px)
            .padding(top = 100.px)
            .fillMaxWidth()
    ) {
        FooterContent()
    }
}