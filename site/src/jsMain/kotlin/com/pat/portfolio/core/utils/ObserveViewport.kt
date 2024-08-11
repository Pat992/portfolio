package com.pat.portfolio.core.utils

import androidx.compose.runtime.*
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.asList
import org.w3c.dom.events.EventListener

@Composable
fun ObserveViewportEntered(
    id: String,
    threshold: Double,
    onViewportEntered: () -> Unit,
    onViewportLeft: () -> Unit
) {
    var viewportEntered by remember { mutableStateOf(false) }
    val listener = remember {
        EventListener {
            val top = document.getElementById(id)
                ?.getBoundingClientRect()
                ?.top
            if (top != null && top < threshold) {
                viewportEntered = true
            } else if (top != null && top > threshold) {
                viewportEntered = false
            }
        }
    }

    LaunchedEffect(viewportEntered) {
        if (viewportEntered) {
            onViewportEntered()
            // you can remove the listener, if the animation only needs to play once
            // window.removeEventListener(type = "scroll", callback = listener)
        } else {
            onViewportLeft()
            window.addEventListener(type = "scroll", callback = listener)
        }
    }
}

@Composable
fun SectionViewportObserver(
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
                val bottom = rect.bottom

                if ((top + threshold) >= 0 && bottom <= (windowHeight + threshold)) {
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