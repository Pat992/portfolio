package com.pat.portfolio.dtos

import org.w3c.xhr.FormData

data class EmailJsFormDto(
    val name: String,
    val email: String,
    val message: String
) {
    fun toFormData(): FormData {
        val formData = FormData()
        formData.append("user_name", name)
        formData.append("user_email", email)
        formData.append("message", message)
        return formData
    }
}