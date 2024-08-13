package com.pat.portfolio.core.utils

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data object ObserveSection {
    var sectionId by mutableStateOf("home")
}