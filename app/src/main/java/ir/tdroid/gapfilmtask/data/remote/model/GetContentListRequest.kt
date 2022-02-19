package ir.tdroid.gapfilmtask.data.remote.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class GetContentListRequest(
    @SerializedName("request")
    var request: Request? = null
) {
    @Keep
    data class Request(
        @SerializedName("Order")
        var order: String? = null,
        @SerializedName("OrderBy")
        var orderBy: String? = null,
        @SerializedName("PageIndex")
        var pageIndex: Int? = null,
        @SerializedName("PageSize")
        var pageSize: Int? = null,
        @SerializedName("RequestId")
        var requestId: Any? = null,
        @SerializedName("RequestType")
        var requestType: Int? = null
    )
}