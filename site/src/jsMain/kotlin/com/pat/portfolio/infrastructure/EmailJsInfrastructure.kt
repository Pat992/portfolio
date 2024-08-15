package com.pat.portfolio.infrastructure

import com.pat.portfolio.dtos.EmailJsFormDto
import com.varabyte.kobweb.browser.http.http
import kotlinx.browser.window

suspend fun emailJsInfrastructureSendForm(emailJsFormDto: EmailJsFormDto): Boolean {
    val formData = emailJsFormDto.toFormData()
    formData.append("service_id", "service_hu17foj")
    formData.append("template_id", "template_kegh07c")
    formData.append("user_id", "FmDwq3RDXB_tZZNm0")

    val res = window.http.tryPost(
        resource = "https://api.emailjs.com/api/v1.0/email/send-form",
        body = formData.unsafeCast<ByteArray>()
    )

    return res != null
}