package com.pat.portfolio.core.utils

import androidx.compose.runtime.*
import kotlinx.browser.document
import kotlinx.browser.window
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