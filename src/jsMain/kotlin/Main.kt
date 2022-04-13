import androidx.compose.runtime.*
import domain.models.Project
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.svg.Image
import ui.utils.Projects
import ui.utils.buttonColor

fun main() {
    renderComposable(rootElementId = "root") {

        val yearsOfExperience by remember { mutableStateOf(2) }

        val projectsCounter by remember {
            mutableStateOf(5)
        }

        Style {
            "body" {
                backgroundColor(ui.utils.backgroundColor)
            }

            "*" {
                color(Color.white)
                fontFamily("Lato")
            }

            className("details").style {
                marginBottom(15.px)
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

            AboutMe(yearsOfExperience, projectsCounter)

            Div {
                H1(
                    attrs = {
                        id("scrollspyLatestWork")
                        classes("text-center")
                        style {
                            marginTop(10.percent)
                        }
                    }
                ) {
                    Text("Latest work")
                }

                Div(
                    attrs = {
                        classes("row")
                    }
                ) {
                    Projects.forEach { project ->
                        Div(
                            attrs = {
                                classes("col-md-6")
                            }
                        ) {
                            ProjectCard(project)
                        }
                    }
                }
            }

            Contact()
        }
    }
}

@Composable
private fun ProjectCard(project: Project) {
    Div(
        attrs = {
            classes("row", "align-items-center")
            style {
                marginTop(10.percent)
            }
        }
    ) {
        Img(project.imgUrl, attrs = {
            style {
                borderRadius(20.percent)
            }
            classes("col-4")
        })
        Div(
            attrs = {
                classes("col")
                style {
                    marginLeft(2.percent)
                }
            }
        ) {
            H4 {
                Text(project.title)
            }
            P {
                Text(project.description)
            }
            if (project.googlePlay)
                A(
                    href = project.googlePlayLink,
                    attrs = {
                        target(ATarget.Blank)
                    }
                ) {
                    Img(
                        "https://en.logodownload.org/wp-content/uploads/2019/06/get-it-on-google-play-badge.png",
                        attrs = {
                            style {
                                width(160.px)
                                height(50.px)
                            }
                        })
                }
        }
    }
}

@Composable
private fun Contact() {
    Footer(
        attrs = {
            id("scrollspyContact")
            style {
                padding(8.percent, 0.px, 3.percent, 0.px)
            }
        }
    ) {
        Div(
            attrs = {
                classes("d-flex", "justify-content-center")
            }
        ) {
            ContactIcon(icon = "fa-github", link = "https://github.com/daniatitienei")
            ContactIcon(icon = "fa-linkedin", link = "https://www.linkedin.com/in/daniel-atitienei-07446020a/")
            ContactIcon(
                type = "fa-solid",
                icon = "fa-envelope", link = "mailto:daniatitienei@gmail.com",
                target = ATarget.Self
            )
        }
    }
}

@Composable
private fun ContactIcon(type: String = "fa-brands", icon: String, link: String, target: ATarget = ATarget.Blank) {
    A(
        href = link,
        attrs = {
            target(target)
            style {
                padding(35.px)
            }
        }
    ) {
        I(
            attrs = {
                classes(type, icon, "fa-2x")
            }
        )
    }
}

@Composable
private fun AboutMe(yearsOfExperience: Int, projectsCounter: Int) {
    Div(
        attrs = {
            classes("row", "d-flex", "justify-content-center")
            id("scrollspyAboutMe")
        }
    ) {
        Description()
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
        Div(
            attrs = {
                classes("col-2", "d-flex", "flex-column", "justify-content-center", )
            }
        ) {
            Div(
                attrs = {
                    classes("details")
                }
            ) {
                H1 {
                    Text("$yearsOfExperience+")
                }
                H5(
                    attrs = {
                        style {
                            color(Color.lightgray)
                        }
                    }
                ) {
                    Text("Years of experience")
                }
            }
            Div(
                attrs = {
                    classes("details")
                }
            ) {
                H1 {
                    Text("$projectsCounter+")
                }
                H5(
                    attrs = {
                        style {
                            color(Color.lightgray)
                        }
                    }
                ) {
                    Text("Completed projects")
                }
            }
            Div(
                attrs = {
                    classes("details")
                }
            ) {
                Span(
                    attrs = {
                        style {
                            letterSpacing(2.px)
                            color(Color.lightgray)
                            marginBottom(5.px)
                        }
                    }
                ) {
                    Text("SERVICES")
                }
                P {
                    Text("Android mobile apps")
                }
            }
        }
    }
}

@Composable
private fun Description() {
    Div(
        attrs = {
            classes("col", "d-flex", "flex-column", "justify-content-center")
        }
    ) {
        H1(
            attrs = {
                style {
                    letterSpacing(2.px)
                }
            }
        ) {
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
                classes("btn", "align-self-start")
            }
        ) {
            A(
                href = "mailto:daniatitienei@gmail.com",
                attrs = {
                    style {
                        color(buttonColor)
                        fontWeight("bold")
                        textDecoration("none")
                    }
                }
            ) {
                Text("LET'S TALK")
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
            classes("navbar", "sticky-top")
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
                        href("#scrollspyAboutMe")
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
                        href("#scrollspyLatestWork")
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
                        href("#scrollspyContact")
                    }
                ) {
                    Text("Contact")
                }
            }

        }
    }
}

