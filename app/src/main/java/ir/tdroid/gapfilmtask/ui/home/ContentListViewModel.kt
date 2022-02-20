package ir.tdroid.gapfilmtask.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.tdroid.gapfilmtask.model.Content
import ir.tdroid.gapfilmtask.repository.ContentRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContentListViewModel @Inject constructor(private val repository: ContentRepository): ViewModel() {

    fun getContentList() = repository.getContentList()

    fun fetchContentList() = repository.updateContentList()

    fun getFavouriteList() = repository.getFavoriteContent()

    fun updateContent(content : Content) {
        viewModelScope.launch {
            repository.updateContent(content)
        }

    }

}