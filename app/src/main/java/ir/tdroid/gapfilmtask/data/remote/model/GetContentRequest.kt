package ir.tdroid.gapfilmtask.data.remote.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class GetContentRequest(
    @SerializedName("request")
    var request: Request? = null
) {
    @Keep
    data class Request(
        @SerializedName("RequestID")
        var requestID: Int? = null
    )
}