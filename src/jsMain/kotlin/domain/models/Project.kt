package domain.models

data class Project(
    val imgUrl: String = "",
    val title: String = "",
    val description: String = "",
    val googlePlay: Boolean = false,
    val googlePlayLink: String = "",
    val appStore: Boolean = false,
    val appStoreLink: String = "",
    val appGallery: Boolean = false,
    val appGalleryLink: String = "",
)
