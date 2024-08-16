package com.pat.portfolio.repositories

import com.pat.portfolio.dtos.EmailJsFormDto
import com.pat.portfolio.infrastructure.emailJsInfrastructureSendForm
import com.pat.portfolio.observables.EmailJsObservable
import com.pat.portfolio.observables.SendingStatus
import kotlinx.browser.document
import org.w3c.dom.HTMLTextAreaElement

suspend fun emailJsRepositorySendEmail() {
    EmailJsObservable.message = (document.getElementById("message") as HTMLTextAreaElement).value

    val emailJsFormDto = EmailJsFormDto(
        name = EmailJsObservable.name,
        email = EmailJsObservable.email,
        message = EmailJsObservable.message
    )

    EmailJsObservable.sendingStatus = SendingStatus.SENDING
    val res = emailJsInfrastructureSendForm(emailJsFormDto)
    if (res) EmailJsObservable.sendingStatus = SendingStatus.SUCCESS
    else EmailJsObservable.sendingStatus = SendingStatus.FAILURE
}

fun emailJsRepositoryCancelRetry() {
    EmailJsObservable.sendingStatus = SendingStatus.NULL
}

fun emailJsRepositoryOnSuccessResetForm() {
    (document.getElementById("message") as HTMLTextAreaElement).value = ""
    EmailJsObservable.name = ""
    EmailJsObservable.email = ""
    EmailJsObservable.message = ""
    EmailJsObservable.sendingStatus = SendingStatus.NULL
}