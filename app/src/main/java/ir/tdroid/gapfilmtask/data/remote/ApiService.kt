package ir.tdroid.gapfilmtask.data.remote

import ir.tdroid.gapfilmtask.data.remote.model.ContentListResponse
import ir.tdroid.gapfilmtask.data.remote.model.GetContentListRequest
import ir.tdroid.gapfilmtask.data.remote.model.GetContentRequest
import ir.tdroid.gapfilmtask.data.remote.model.ContentResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {


    @POST("request.asmx/GetContentList")
    suspend fun getContentList(@Body request: GetContentListRequest) : ContentListResponse


    @POST("request.asmx/GetContent")
    suspend fun getContent(@Body request: GetContentRequest) : ContentResponse




}