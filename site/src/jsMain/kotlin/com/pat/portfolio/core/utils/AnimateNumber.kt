package com.pat.portfolio.core.utils

import kotlinx.coroutines.delay

suspend fun animateNumber(
    number: Int,
    delay: Long = 10L,
    onUpdate: (Int) -> Unit
) {
    (0..number).forEach {
        delay(delay)
        onUpdate(it)
    }
}