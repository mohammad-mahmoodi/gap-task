package ir.tdroid.gapfilmtask.data.remote.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ContentResponse(
    @SerializedName("Message")
    var message: String? = null,
    @SerializedName("Result")
    var result: Result? = null,
    @SerializedName("Status")
    var status: Int? = null
) {
    @Keep
    data class Result(
        @SerializedName("AccessLevelTypeID")
        var accessLevelTypeID: Int? = null,
        @SerializedName("AssetDomain")
        var assetDomain: String? = null,
        @SerializedName("AttachmentList")
        var attachmentList: List<Attachment?>? = null,
        @SerializedName("AttachmentQuality")
        var attachmentQuality: List<AttachmentQuality?>? = null,
        @SerializedName("AuthorList")
        var authorList: List<Any?>? = null,
        @SerializedName("Available")
        var available: Boolean? = null,
        @SerializedName("Body")
        var body: String? = null,
        @SerializedName("Categories")
        var categories: List<Category?>? = null,
        @SerializedName("CollectionImage")
        var collectionImage: Any? = null,
        @SerializedName("CommentCount")
        var commentCount: Int? = null,
        @SerializedName("CommentPermission")
        var commentPermission: Int? = null,
        @SerializedName("CommentTemplateList")
        var commentTemplateList: List<CommentTemplate?>? = null,
        @SerializedName("ContentID")
        var contentID: Int? = null,
        @SerializedName("CreateDate")
        var createDate: Int? = null,
        @SerializedName("DirectorList")
        var directorList: List<Any?>? = null,
        @SerializedName("DisLikeCount")
        var disLikeCount: Int? = null,
        @SerializedName("DisLikeStatus")
        var disLikeStatus: Boolean? = null,
        @SerializedName("EnglishBody")
        var englishBody: String? = null,
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
        @SerializedName("NarratorList")
        var narratorList: List<Any?>? = null,
        @SerializedName("NumberOfSeason")
        var numberOfSeason: Int? = null,
        @SerializedName("PortraitImage")
        var portraitImage: String? = null,
        @SerializedName("PortraitImage9X11")
        var portraitImage9X11: String? = null,
        @SerializedName("Price")
        var price: Double? = null,
        @SerializedName("Properties")
        var properties: List<Property?>? = null,
        @SerializedName("SMSOperationCode")
        var sMSOperationCode: String? = null,
        @SerializedName("ShortURL")
        var shortURL: String? = null,
        @SerializedName("SourceSiteLogoUrl")
        var sourceSiteLogoUrl: String? = null,
        @SerializedName("SourceSiteTitle")
        var sourceSiteTitle: String? = null,
        @SerializedName("SourceSiteWebUrl")
        var sourceSiteWebUrl: String? = null,
        @SerializedName("StarsList")
        var starsList: List<Stars?>? = null,
        @SerializedName("Summary")
        var summary: String? = null,
        @SerializedName("TagList")
        var tagList: List<Tag?>? = null,
        @SerializedName("ThumbImage")
        var thumbImage: String? = null,
        @SerializedName("Title")
        var title: String? = null,
        @SerializedName("TrafficInfo")
        var trafficInfo: TrafficInfo? = null,
        @SerializedName("TranslatorList")
        var translatorList: List<Any?>? = null,
        @SerializedName("Type")
        var type: Int? = null,
        @SerializedName("UpdateDate")
        var updateDate: Int? = null,
        @SerializedName("ViewCount")
        var viewCount: Int? = null,
        @SerializedName("WikiList")
        var wikiList: List<Any?>? = null,
        @SerializedName("ZoneID")
        var zoneID: Int? = null
    ) {
        @Keep
        data class Attachment(
            @SerializedName("Available")
            var available: Boolean? = null,
            @SerializedName("Description")
            var description: String? = null,
            @SerializedName("Duration")
            var duration: Int? = null,
            @SerializedName("FileExtension")
            var fileExtension: String? = null,
            @SerializedName("Files")
            var files: List<File?>? = null,
            @SerializedName("GroupId")
            var groupId: Int? = null,
            @SerializedName("GroupTitle")
            var groupTitle: Any? = null,
            @SerializedName("IsDubbed")
            var isDubbed: Boolean? = null,
            @SerializedName("IsFree")
            var isFree: Boolean? = null,
            @SerializedName("LastVisitEndSecond")
            var lastVisitEndSecond: Int? = null,
            @SerializedName("PartNo")
            var partNo: Int? = null,
            @SerializedName("Title")
            var title: String? = null,
            @SerializedName("Type")
            var type: Int? = null,
            @SerializedName("ViewCount")
            var viewCount: Int? = null
        ) {
            @Keep
            data class File(
                @SerializedName("CdnId")
                var cdnId: Any? = null,
                @SerializedName("CdnType")
                var cdnType: Int? = null,
                @SerializedName("Description")
                var description: String? = null,
                @SerializedName("Duration")
                var duration: Int? = null,
                @SerializedName("FileExtension")
                var fileExtension: String? = null,
                @SerializedName("Path")
                var path: String? = null,
                @SerializedName("Quality")
                var quality: Int? = null,
                @SerializedName("Size")
                var size: Long? = null,
                @SerializedName("Thumbnail")
                var thumbnail: String? = null,
                @SerializedName("Times")
                var times: List<Any?>? = null,
                @SerializedName("Type")
                var type: Int? = null,
                @SerializedName("UniqueId")
                var uniqueId: Int? = null,
                @SerializedName("ViewCount")
                var viewCount: Int? = null
            )
        }

        @Keep
        data class AttachmentQuality(
            @SerializedName("ID")
            var iD: Int? = null,
            @SerializedName("Title")
            var title: String? = null
        )

        @Keep
        data class Category(
            @SerializedName("CategoryID")
            var categoryID: Int? = null,
            @SerializedName("ParentID")
            var parentID: Int? = null,
            @SerializedName("Title")
            var title: String? = null,
            @SerializedName("ZoneID")
            var zoneID: Int? = null
        )

        @Keep
        data class CommentTemplate(
            @SerializedName("Body")
            var body: String? = null,
            @SerializedName("Id")
            var id: Int? = null,
            @SerializedName("TypeId")
            var typeId: Int? = null,
            @SerializedName("TypeTitle")
            var typeTitle: String? = null
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
        data class Stars(
            @SerializedName("AvatarUrl")
            var avatarUrl: String? = null,
            @SerializedName("BirthDate")
            var birthDate: Int? = null,
            @SerializedName("Children")
            var children: List<Any?>? = null,
            @SerializedName("ContentID")
            var contentID: Int? = null,
            @SerializedName("ContentPersonId")
            var contentPersonId: Int? = null,
            @SerializedName("DeathDate")
            var deathDate: Int? = null,
            @SerializedName("EnglishName")
            var englishName: String? = null,
            @SerializedName("ID")
            var iD: Int? = null,
            @SerializedName("LikeStatus")
            var likeStatus: Boolean? = null,
            @SerializedName("Nationality")
            var nationality: Any? = null,
            @SerializedName("NickName")
            var nickName: Any? = null,
            @SerializedName("OtherInfo")
            var otherInfo: Any? = null,
            @SerializedName("ParentId")
            var parentId: Any? = null,
            @SerializedName("PersianName")
            var persianName: String? = null,
            @SerializedName("PersonRoleId")
            var personRoleId: Int? = null
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
            var isFollowed: Any? = null,
            @SerializedName("IsSelected")
            var isSelected: Boolean? = null,
            @SerializedName("Name")
            var name: String? = null,
            @SerializedName("SectionPriority")
            var sectionPriority: Int? = null,
            @SerializedName("TagId")
            var tagId: Int? = null
        )

        @Keep
        data class TrafficInfo(
            @SerializedName("IsDomesticTraffic")
            var isDomesticTraffic: Boolean? = null,
            @SerializedName("OperatorType")
            var operatorType: Int? = null,
            @SerializedName("TrafficPrice")
            var trafficPrice: Int? = null
        )
    }
}