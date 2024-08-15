package com.pat.portfolio.observables

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data object EmailJsObservable {
    var name by mutableStateOf("")
    var email by mutableStateOf("")
    var message by mutableStateOf("")
    var sendingStatus by mutableStateOf(SendingStatus.NULL)
}

enum class SendingStatus {
    NULL,
    SENDING,
    SUCCESS,
    FAILURE
}