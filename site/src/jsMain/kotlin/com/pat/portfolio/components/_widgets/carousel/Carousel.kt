package com.pat.portfolio.components._widgets.carousel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.toAttrs
import kotlinx.browser.document
import org.jetbrains.compose.web.dom.Ul
import kotlin.js.Json
import kotlin.js.json

@Composable
fun Carousel(
    modifier: Modifier = Modifier,
    id: String,
    content: @Composable () -> Unit
) {
    LaunchedEffect(Unit) {
        Splide(
            ".splide.$id", json(
                "rewind" to true,
                "lazyLoad" to "nearby",
                "perPage" to 3,
                "width" to "1000px",
                "gap" to "25px",
                "autoplay" to true,
                "focus" to "center",
                "breakpoints" to json(
                    "640" to json(
                        "perPage" to 1,
                        "width" to "400px"
                    )
                )
            )
        ).mount()
        document.addEventListener("DOMContentLoaded", {
        })
    }

    Box(
        modifier = Modifier.classNames(id, "splide").then(modifier)
    ) {
        Box(
            modifier = Modifier.classNames("splide__track")
        ) {
            Ul(
                attrs = Modifier
                    .classNames("splide__list")
                    .toAttrs()
            ) {
                content()
            }
        }
    }
}

@JsModule("@splidejs/splide")
@JsNonModule
external class Splide(
    element: String,
    options: Json
) {
    fun mount()
}