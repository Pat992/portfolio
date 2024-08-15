package com.pat.portfolio.core.utils

import androidx.compose.runtime.*
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.asList
import org.w3c.dom.events.EventListener
import org.w3c.dom.events.MouseEvent

@Composable
fun ObserveViewport(
    threshold: Double = 0.0,
    onScrollChanged: (String) -> Unit,
    onScrollPercentageChanged: (Double) -> Unit,
    onMousePositionChanged: (Int, Int) -> Unit
) {
    var sectionViewportEntered by remember { mutableStateOf("home") }
    var scrollPercentage by remember { mutableStateOf(0.0) }
    var mousePositionX by remember { mutableStateOf(0) }
    var mousePositionY by remember { mutableStateOf(0) }
    val windowHeight = window.innerHeight
    val elements = document.getElementsByClassName("section")

    val mouseScrollListener = remember {
        EventListener {
            elements.asList().forEach { element ->
                val rect = element.getBoundingClientRect()
                val top = rect.top

                scrollPercentage =
                    window.pageYOffset / (window.document.body?.scrollHeight?.minus(window.innerHeight.toDouble())
                        ?: 0.0)

                onScrollPercentageChanged(scrollPercentage)

                if ((top + threshold) >= 0 && (top + threshold) < windowHeight) {
                    if (sectionViewportEntered != element.id) {
                        sectionViewportEntered = element.id
                        onScrollChanged(sectionViewportEntered)
                    }
                }
            }
        }
    }

    val mouseMoveListener = remember {
        EventListener { event ->
            val mouseEvent = (event as MouseEvent)
            mousePositionY = mouseEvent.clientY
            mousePositionX = mouseEvent.clientX
            onMousePositionChanged(mousePositionY, mousePositionX)
        }
    }

    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll", callback = mouseScrollListener)
        window.addEventListener(type = "mousemove", callback = mouseMoveListener)
    }
}