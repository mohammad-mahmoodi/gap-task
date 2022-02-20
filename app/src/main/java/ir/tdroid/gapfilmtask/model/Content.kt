package ir.tdroid.gapfilmtask.model


data class Content(
    var ContentID: Int? = null,
    var title: String? = null,
    var ZoneId: Int? = null,
    var landscapeImage: String? = null,
    var isFavourite: Boolean = false
)
