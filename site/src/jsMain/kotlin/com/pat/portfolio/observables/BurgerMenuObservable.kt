package com.pat.portfolio.observables

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data object BurgerMenuObservable {
    var isOpen by mutableStateOf(false)
}