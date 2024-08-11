package com.pat.portfolio.core.utils

import androidx.compose.runtime.*
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.asList
import org.w3c.dom.events.EventListener

@Composable
fun ObserveViewport(
    threshold: Double = 0.0,
    onViewportChanged: (String) -> Unit
) {
    var sectionViewportEntered by remember { mutableStateOf("home") }
    val windowHeight = window.innerHeight
    val elements = document.getElementsByClassName("section")

    val listener = remember {
        EventListener {
            elements.asList().forEach { element ->
                val rect = element.getBoundingClientRect()
                val top = rect.top

                if ((top + threshold) >= 0 && (top + threshold) < windowHeight) {
                    if (sectionViewportEntered != element.id) {
                        sectionViewportEntered = element.id
                        onViewportChanged(sectionViewportEntered)
                    }
                }
            }
        }
    }

    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll", callback = listener)
    }
}