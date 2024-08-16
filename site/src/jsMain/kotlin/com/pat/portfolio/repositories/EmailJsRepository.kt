package com.pat.portfolio.repositories

import com.pat.portfolio.dtos.EmailJsFormDto
import com.pat.portfolio.infrastructure.emailJsInfrastructurePostForm
import com.pat.portfolio.observables.EmailJsObservable
import com.pat.portfolio.observables.RequestStatus
import kotlinx.browser.document
import org.w3c.dom.HTMLTextAreaElement

suspend fun emailJsRepositorySendEmail() {
    EmailJsObservable.message = (document.getElementById("message") as HTMLTextAreaElement).value

    val emailJsFormDto = EmailJsFormDto(
        name = EmailJsObservable.name,
        email = EmailJsObservable.email,
        message = EmailJsObservable.message
    )

    EmailJsObservable.sendingStatus = RequestStatus.LOADING
    val res = emailJsInfrastructurePostForm(emailJsFormDto)
    if (res) EmailJsObservable.sendingStatus = RequestStatus.SUCCESS
    else EmailJsObservable.sendingStatus = RequestStatus.FAILURE
}

fun emailJsRepositoryCancelRetry() {
    EmailJsObservable.sendingStatus = RequestStatus.NULL
}

fun emailJsRepositoryOnSuccessResetForm() {
    (document.getElementById("message") as HTMLTextAreaElement).value = ""
    EmailJsObservable.name = ""
    EmailJsObservable.email = ""
    EmailJsObservable.message = ""
    EmailJsObservable.sendingStatus = RequestStatus.NULL
}