package com.pat.portfolio.observables

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.pat.portfolio.dtos.GithubLanguageDto

data object GithubObservable {
    var languagesCount by mutableStateOf(0)
    var languages: MutableList<GithubLanguageDto> by mutableStateOf(mutableListOf())
    var requestStatus by mutableStateOf(RequestStatus.NULL)
    var hasRequestSent by mutableStateOf(false)
}