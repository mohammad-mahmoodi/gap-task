package ir.tdroid.gapfilmtask.data.remote.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ContentListResponse(
    @SerializedName("Message")
    var message: String? = null,
    @SerializedName("Result")
    var result: Result? = null,
    @SerializedName("Status")
    var status: Int? = null
) {
    @Keep
    data class Result(
        @SerializedName("GetContentList")
        var getContentList: List<GetContent?>? = null,
        @SerializedName("TotalPages")
        var totalPages: Int? = null
    ) {
        @Keep
        data class GetContent(
            @SerializedName("AccessLevelTypeID")
            var accessLevelTypeID: Int? = null,
            @SerializedName("Authors")
            var authors: String? = null,
            @SerializedName("Categories")
            var categories: List<Category?>? = null,
            @SerializedName("CollectionImage")
            var collectionImage: Any? = null,
            @SerializedName("CommentCount")
            var commentCount: Int? = null,
            @SerializedName("ContentID")
            var contentID: Int? = null,
            @SerializedName("CreateDate")
            var createDate: Int? = null,
            @SerializedName("DisLikeCount")
            var disLikeCount: Int? = null,
            @SerializedName("DisLikeStatus")
            var disLikeStatus: Boolean? = null,
            @SerializedName("Duration")
            var duration: Int? = null,
            @SerializedName("EnglishBody")
            var englishBody: Any? = null,
            @SerializedName("FavoriteStatus")
            var favoriteStatus: Boolean? = null,
            @SerializedName("FreeReleaseDate")
            var freeReleaseDate: Any? = null,
            @SerializedName("InstagramImage9X11")
            var instagramImage9X11: Any? = null,
            @SerializedName("IsEditorsChoice")
            var isEditorsChoice: Boolean? = null,
            @SerializedName("LandscapeImage")
            var landscapeImage: String? = null,
            @SerializedName("LandscapeImage9X4")
            var landscapeImage9X4: String? = null,
            @SerializedName("LikeCount")
            var likeCount: Int? = null,
            @SerializedName("LikeStatus")
            var likeStatus: Boolean? = null,
            @SerializedName("PortraitImage")
            var portraitImage: String? = null,
            @SerializedName("PortraitImage9X11")
            var portraitImage9X11: String? = null,
            @SerializedName("Price")
            var price: Double? = null,
            @SerializedName("Properties")
            var properties: List<Property?>? = null,
            @SerializedName("PurchasedPrice")
            var purchasedPrice: Double? = null,
            @SerializedName("SourceSiteLogoUrl")
            var sourceSiteLogoUrl: String? = null,
            @SerializedName("SourceSiteTitle")
            var sourceSiteTitle: String? = null,
            @SerializedName("SourceSiteWebUrl")
            var sourceSiteWebUrl: String? = null,
            @SerializedName("Summary")
            var summary: String? = null,
            @SerializedName("SupplierID")
            var supplierID: Int? = null,
            @SerializedName("TagList")
            var tagList: List<Tag?>? = null,
            @SerializedName("TeacherList")
            var teacherList: List<Any?>? = null,
            @SerializedName("ThumbImage")
            var thumbImage: String? = null,
            @SerializedName("Title")
            var title: String? = null,
            @SerializedName("Type")
            var type: Int? = null,
            @SerializedName("UpdateDate")
            var updateDate: Int? = null,
            @SerializedName("ViewCount")
            var viewCount: Int? = null,
            @SerializedName("ZoneID")
            var zoneID: Int? = null
        ) {
            @Keep
            data class Category(
                @SerializedName("AgeRangeId")
                var ageRangeId: Any? = null,
                @SerializedName("CategoryID")
                var categoryID: Int? = null,
                @SerializedName("DefaultImage")
                var defaultImage: String? = null,
                @SerializedName("HasCopyRight")
                var hasCopyRight: Boolean? = null,
                @SerializedName("Image")
                var image: String? = null,
                @SerializedName("IsFollowed")
                var isFollowed: Any? = null,
                @SerializedName("IsSelected")
                var isSelected: Boolean? = null,
                @SerializedName("ParentID")
                var parentID: Int? = null,
                @SerializedName("SectionPriority")
                var sectionPriority: Int? = null,
                @SerializedName("Title")
                var title: String? = null,
                @SerializedName("ZoneID")
                var zoneID: Int? = null
            )

            @Keep
            data class Property(
                @SerializedName("Name")
                var name: String? = null,
                @SerializedName("PropertyId")
                var propertyId: Int? = null,
                @SerializedName("Value")
                var value: String? = null
            )

            @Keep
            data class Tag(
                @SerializedName("BackgroundImage")
                var backgroundImage: String? = null,
                @SerializedName("Description")
                var description: Any? = null,
                @SerializedName("Image")
                var image: String? = null,
                @SerializedName("IsFollowed")
                var isFollowed: Boolean? = null,
                @SerializedName("IsSelected")
                var isSelected: Boolean? = null,
                @SerializedName("Name")
                var name: String? = null,
                @SerializedName("SectionPriority")
                var sectionPriority: Int? = null,
                @SerializedName("TagId")
                var tagId: Int? = null
            )
        }
    }
}