package ir.tdroid.gapfilmtask.ui.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.tdroid.gapfilmtask.common.Resource
import ir.tdroid.gapfilmtask.common.retryIO
import ir.tdroid.gapfilmtask.data.remote.model.ContentResponse
import ir.tdroid.gapfilmtask.data.remote.model.GetContentRequest
import ir.tdroid.gapfilmtask.repository.ContentRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContentViewModel @Inject constructor(private val repository: ContentRepository) :
    ViewModel() {

    private val content: MutableLiveData<Resource<ContentResponse>> by lazy {
        MutableLiveData<Resource<ContentResponse>>()
    }
    val contentLiveData: LiveData<Resource<ContentResponse>> = content
    fun getContent(request: GetContentRequest) {
        viewModelScope.launch {
            try {
                content.postValue(Resource.Loading)
                val data = retryIO {repository.getContent(request)}
                content.postValue(Resource.Success(data))
            } catch (e: Exception) {
                e.printStackTrace()
                content.postValue(Resource.Error("خطا"))
            }
        }
    }

    fun isFavoriteContents(id: Int) = repository.isFavoriteContents(id)

    fun toggleFavoriteContents(id: Int) {
        viewModelScope.launch {
            repository.toggleFavoriteContents(id)
        }
    }
}