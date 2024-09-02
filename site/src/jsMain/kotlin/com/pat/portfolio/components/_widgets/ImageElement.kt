package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.graphics.Image

@Composable
fun ImageElement(
    modifier: Modifier = Modifier,
    src: String,
    alt: String
) {
    Image(
        modifier = Modifier
            .then(modifier),
        src = src,
        alt = alt
    )
}