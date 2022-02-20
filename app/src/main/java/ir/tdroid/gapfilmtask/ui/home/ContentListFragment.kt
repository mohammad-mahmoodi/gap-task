package ir.tdroid.gapfilmtask.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ir.tdroid.gapfilmtask.base.BaseFragment
import ir.tdroid.gapfilmtask.common.Resource
import ir.tdroid.gapfilmtask.databinding.FragmentContentListBinding
@AndroidEntryPoint
class ContentListFragment : BaseFragment<FragmentContentListBinding>() {
    private val contentListViewModel : ContentListViewModel by viewModels()
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentContentListBinding {
        return FragmentContentListBinding.inflate(inflater,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        contentListViewModel.getContentList().observe(viewLifecycleOwner){
            it.size
        }


        contentListViewModel.fetchContentList().observe(viewLifecycleOwner){
            when(it) {
                is Resource.Error -> {

                }
                Resource.Loading -> {
                }
                is Resource.Success -> {


                }
            }
        }

    }

}