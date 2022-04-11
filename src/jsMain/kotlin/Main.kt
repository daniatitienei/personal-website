import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.svg.Image
import org.w3c.dom.HTMLFontElement
import ui.backgroundColor
import ui.buttonColor

fun main() {

    renderComposable(rootElementId = "root") {

        Style {
            "body" {
                backgroundColor(ui.backgroundColor)
            }

            "*" {
                color(Color.white)
                fontFamily("Lato")
            }
        }

        Main(
            attrs = {
                classes("container-fluid")
                style {
                    padding(0.px, 20.px, 0.px, 20.px)
                }
            }
        ) {
            NavBar()

            Div(
                attrs = {
                    classes("row")
                }
            ) {
                Div(
                    attrs = {
                        classes("col")
                    }
                ) {
                    H1 {
                        Text("Atitienei Daniel")
                    }
                    H2 {
                        Text("Android Developer")
                    }
                    P(
                        attrs = {
                            style {
                                color(Color.RGBA(256, 256, 256, 0.7))
                            }
                        }
                    ) {
                        Text("I found my passion for programming 2 years ago when I was 15. In this period I've worked with a lot of different technologies and programming languages. \n\n Nowadays, I’m specialize in native Android development, but I still consider that my past experience with other technologies helped me.")
                    }

                    Button(
                        attrs = {
                            classes("btn")
                        }
                    ) {
                        A(
                            attrs = {
                                style {
                                    color(buttonColor)
                                    fontWeight("bold")
                                }
                            }
                        ) {
                            Text("LET'S TALK")
                        }
                    }
                }
                Div(
                    attrs = {
                        classes("col")
                    }
                ) {

                    Img(
                        src = "https://media-exp1.licdn.com/dms/image/C4E03AQHIc1IDcbSzfg/profile-displayphoto-shrink_800_800/0/1637680096577?e=1654732800&v=beta&t=2yIHT-4xjwjEAMhiBX1I4a3VS5Ovslh5PMSoqqVWnuM",
                        attrs = {
                            classes("img-fluid")
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun NavBar() {
    Style {
        "li" {
            display(DisplayStyle.InlineBlock)
            padding(10.px)
        }

        "li a" {
            textDecoration("none")
        }
    }

    Nav(
        attrs = {
            classes("navbar")
        }
    ) {
        Ul(
            attrs = {
                classes("ms-auto")
            }
        ) {
            Li(
                attrs = {
                    classes("nav-item")
                }
            ) {
                A(
                    attrs = {
                        classes("link-light")
                        href("#")
                    }
                ) {
                    Text("About me")
                }
            }
            Li(
                attrs = {
                    classes("nav-item")
                }
            ) {
                A(
                    attrs = {
                        classes("link-light")
                        href("#")
                    }
                ) {
                    Text("Latest work")
                }
            }
            Li(
                attrs = {
                    classes("nav-item")
                }
            ) {
                A(
                    attrs = {
                        classes("link-light")
                        href("#")
                    }
                ) {
                    Text("Contact")
                }
            }

        }
    }
}

