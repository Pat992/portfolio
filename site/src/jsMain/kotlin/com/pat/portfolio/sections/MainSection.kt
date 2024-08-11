package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.SectionWrapper
import com.pat.portfolio.components._widgets.inputs.LinkElement
import com.pat.portfolio.components.mainSection.MainSubtitle
import com.pat.portfolio.components.mainSection.MainTitle
import com.pat.portfolio.core.constants.Font.SUBTITLE_SIZE
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint

@Composable
fun MainSection(
    onViewportEntered: Boolean
) {
    val breakpoint = rememberBreakpoint()
    SectionWrapper(
        section = Section.Main,
        onViewportEntered = onViewportEntered
    ) {
        MainTitle(breakpoint = breakpoint)
        MainSubtitle(breakpoint = breakpoint)
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            LinkElement(
                path = Section.Contact.path,
                content =
                {
                    SpanText(
                        modifier = Modifier.fontSize(SUBTITLE_SIZE),
                        text = "CONTACT ME"
                    )
                }
            )
        }

    }
}