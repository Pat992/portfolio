package com.pat.portfolio.components._widgets.wrappers

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.MouseFollowingGradient
import com.pat.portfolio.components.indexPage.contactSection.ContactModal
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.observables.EmailJsObservable
import com.pat.portfolio.observables.RequestStatus
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun PageWrapper(
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Theme.BackgroundColor.rgb)
            .overflow(Overflow.Hidden),
        contentAlignment = Alignment.Center
    ) {
        if (EmailJsObservable.sendingStatus != RequestStatus.NULL)
            ContactModal()
        MouseFollowingGradient()
        Column(
            modifier = Modifier
                .fillMaxWidth(90.percent)
                .maxWidth(1920.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            content()
        }
    }
}