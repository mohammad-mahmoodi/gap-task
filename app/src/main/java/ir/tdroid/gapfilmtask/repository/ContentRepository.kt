package ir.tdroid.gapfilmtask.repository

import androidx.lifecycle.liveData
import androidx.lifecycle.map
import ir.tdroid.gapfilmtask.common.Resource
import ir.tdroid.gapfilmtask.data.db.dao.ContentDao
import ir.tdroid.gapfilmtask.data.db.entity.toContent
import ir.tdroid.gapfilmtask.data.db.entity.toDbContent
import ir.tdroid.gapfilmtask.data.remote.ApiService
import ir.tdroid.gapfilmtask.data.remote.model.GetContentListRequest
import ir.tdroid.gapfilmtask.data.remote.model.toContent
import ir.tdroid.gapfilmtask.model.Content
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContentRepository @Inject constructor(
    private val apiService: ApiService,
    private val contentDao: ContentDao
) {

    fun updateContentList() = liveData<Resource<Unit>> {
        this.emit(Resource.Loading)
        try {
            val remoteData = apiService.getContentList(
                request = GetContentListRequest(
                    GetContentListRequest.Request(
                        requestType = 2,
                        pageSize = 10,
                        pageIndex = 1,
                        orderBy = "createdate",
                        order = "desc"
                    )
                )
            )
            val dbContentList = remoteData.result!!.getContentList!!
                .map { it!!.toContent() }
                .map { it.toDbContent() }
            contentDao.insertAll(dbContentList)
            this.emit(Resource.Success(Unit))
        } catch (e: Exception) {
            e.printStackTrace()
            this.emit(Resource.Error("error"))
        }
    }
    fun getFavoriteContent() = contentDao.getFavoriteContents().map { it.map { content -> content.toContent() } }

   suspend fun updateContent(content : Content) {
        contentDao.update(content.toDbContent())
    }

    fun getContentList() = contentDao.getContents().map { it.map { content -> content.toContent() } }
}