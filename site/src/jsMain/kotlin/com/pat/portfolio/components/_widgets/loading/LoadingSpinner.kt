package com.pat.portfolio.components._widgets.loading

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.observables.GithubObservable
import com.pat.portfolio.observables.RequestStatus
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw

@Composable
fun LoadingSpinner() {
    Column(
        modifier = Modifier
            .backgroundColor(Theme.BackgroundColor.rgb)
            .display(if (GithubObservable.requestStatus == RequestStatus.LOADING) DisplayStyle.Flex else DisplayStyle.None)
            .fillMaxSize()
            .width(100.vw)
            .height(100.vh),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box {
            LoadingSpinnerEllipse(color = Theme.HighlightColor1.hex)
            LoadingSpinnerEllipse(color = Theme.HighlightColor2.hex)
            LoadingSpinnerEllipse(color = Theme.HighlightColor3.hex)
            LoadingSpinnerEllipse(color = Theme.HighlightColor4.hex)
        }
        Subtitle(
            modifier = Modifier.margin(top = 100.px),
            text = "Loading..."
        )
    }
}

@Composable
private fun LoadingSpinnerEllipse(color: String) {
    Box(
        modifier = Modifier.classNames("loader-line-wrap")
    ) {
        Box(
            modifier = Modifier
                .classNames("loader-line")
                .styleModifier {
                    property("border-color", color)
                }
        )
    }
}