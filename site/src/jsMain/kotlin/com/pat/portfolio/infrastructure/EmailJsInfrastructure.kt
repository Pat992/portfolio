package com.pat.portfolio.infrastructure

import com.pat.portfolio.core.constants.ExternalUrls.EMAILJS_FORM_URL
import com.pat.portfolio.dtos.EmailJsFormDto
import com.varabyte.kobweb.browser.http.http
import kotlinx.browser.window

suspend fun emailJsInfrastructurePostForm(emailJsFormDto: EmailJsFormDto): Boolean {
    val formData = emailJsFormDto.toFormData()
    formData.append("service_id", "service_hu17foj")
    formData.append("template_id", "template_kegh07c")
    formData.append("user_id", "FmDwq3RDXB_tZZNm0")

    return window.http.tryPost(
        resource = EMAILJS_FORM_URL,
        body = formData.unsafeCast<ByteArray>()
    ) != null
}