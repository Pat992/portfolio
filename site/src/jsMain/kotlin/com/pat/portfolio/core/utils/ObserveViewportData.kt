package com.pat.portfolio.core.utils

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.browser.window

data object ObserveViewportData {
    var sectionId by mutableStateOf("home")
    var mousePositionX by mutableStateOf(window.innerWidth / 2)
    var mousePositionY by mutableStateOf(250)
    var scrollPercentage by mutableStateOf(0.0)
}