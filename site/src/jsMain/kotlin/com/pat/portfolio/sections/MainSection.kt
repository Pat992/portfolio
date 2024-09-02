package com.pat.portfolio.sections

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.buttons.PrimaryLinkElement
import com.pat.portfolio.components._widgets.wrappers.SectionWrapper
import com.pat.portfolio.components.indexPage.mainSection.MainSubtitle
import com.pat.portfolio.components.indexPage.mainSection.MainTitle
import com.pat.portfolio.core.constants.FontSizes.SUBTITLE_SIZE
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.vh

@Composable
fun MainSection() {
    val breakpoint = rememberBreakpoint()
    SectionWrapper(
        modifier = Modifier.minHeight(100.vh),
        section = Section.Main
    ) {
        MainTitle(breakpoint = breakpoint)
        MainSubtitle(title = "PATRICK HETTICH", breakpoint = breakpoint)
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            PrimaryLinkElement(
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