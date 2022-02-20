package ir.tdroid.gapfilmtask.ui.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.tdroid.gapfilmtask.repository.ContentRepository
import javax.inject.Inject

@HiltViewModel
class ContentListViewModel @Inject constructor(private val repository: ContentRepository): ViewModel() {

    fun getContentList() = repository.getContentList()

    fun fetchContentList() = repository.updateContentList()

}