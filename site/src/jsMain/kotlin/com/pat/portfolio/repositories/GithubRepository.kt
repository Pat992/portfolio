package com.pat.portfolio.repositories

import com.pat.portfolio.infrastructure.githubInfrastructureGetLanguages
import com.pat.portfolio.observables.GithubObservable
import com.pat.portfolio.observables.RequestStatus

suspend fun githubRepositoryGetLanguages() {
    GithubObservable.requestStatus = RequestStatus.LOADING

    val res = githubInfrastructureGetLanguages()
    if (res == null) {
        GithubObservable.requestStatus = RequestStatus.FAILURE
        GithubObservable.hasRequestSent = true
        return
    }

    res.sortLanguagesBySize()

    res.languages
        .take(10)
        .forEach { language ->
            GithubObservable.languages.add(language)
            GithubObservable.languagesCount += language.count
        }
    GithubObservable.requestStatus = RequestStatus.SUCCESS
    GithubObservable.hasRequestSent = true
}