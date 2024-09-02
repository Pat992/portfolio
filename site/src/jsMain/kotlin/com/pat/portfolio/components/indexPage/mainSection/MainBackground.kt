package com.pat.portfolio.components.indexPage.mainSection

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.dom.svg.Defs
import com.varabyte.kobweb.compose.dom.svg.RadialGradient
import com.varabyte.kobweb.compose.dom.svg.Svg
import com.varabyte.kobweb.compose.dom.svg.SvgId
import com.varabyte.kobweb.compose.foundation.layout.Box
import org.jetbrains.compose.web.css.percent

@Composable
fun MainBackground() {
    Box {
        Svg {
            Defs {
                RadialGradient(id = SvgId("radial1"), attrs = {
                    cx(50.percent)
                    cy(50.percent)
                    r(0.5)
                    attr("fx", "0.441602%")
                    attr("fy", "50%")
                },
                    content = {
                    }
                )
            }
        }
    }
}