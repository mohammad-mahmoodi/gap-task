package ir.tdroid.gapfilmtask.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import ir.tdroid.gapfilmtask.base.BaseFragment
import ir.tdroid.gapfilmtask.common.Resource
import ir.tdroid.gapfilmtask.databinding.FragmentContentListBinding
import ir.tdroid.gapfilmtask.model.Content

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
        val contentAdapter = ContentAdapter()
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.adapter = contentAdapter
        contentListViewModel.getContentList().observe(viewLifecycleOwner){
            contentAdapter.submitList(it)
        }

        contentAdapter.onFavClick = {
            val item = it.copy()
            item.isFavourite = !it.isFavourite
            contentListViewModel.updateContent(item)
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