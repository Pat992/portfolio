package com.pat.portfolio.components._widgets.carousel

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames

@Composable
fun CarouselItem(
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .classNames("splide__slide")
            .attrsModifier {
                attr("data-splide-interval", "5000")
            },
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}