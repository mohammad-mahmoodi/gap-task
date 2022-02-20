package ir.tdroid.gapfilmtask.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ir.tdroid.gapfilmtask.model.Content

@Entity(tableName = "content")
data class DbContent(
    @ColumnInfo(name = "ContentID")
    @PrimaryKey(autoGenerate = false) val ContentID: Int?,
    @ColumnInfo(name = "title") val title: String? = null,
    @ColumnInfo(name = "ZoneId") val ZoneId: Int? = null,
    @ColumnInfo(name = "LandscapeImage") val landscapeImage: String? = null,
    @ColumnInfo(name = "isFavourite") val isFavourite: Boolean = false
)


fun DbContent.toContent(): Content {
    return Content(
        ContentID = this.ContentID,
        title = this.title,
        ZoneId = this.ZoneId,
        landscapeImage = this.landscapeImage,
        isFavourite = this.isFavourite
    )
}

fun Content.toDbContent(): DbContent {
    return DbContent(
        ContentID = this.ContentID,
        title = this.title,
        ZoneId = this.ZoneId,
        landscapeImage = this.landscapeImage,
        isFavourite = this.isFavourite
    )
}