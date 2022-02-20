package ir.tdroid.gapfilmtask.ui.content

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import ir.tdroid.gapfilmtask.R
import ir.tdroid.gapfilmtask.base.BaseFragment
import ir.tdroid.gapfilmtask.common.Resource
import ir.tdroid.gapfilmtask.common.state
import ir.tdroid.gapfilmtask.data.remote.model.GetContentRequest
import ir.tdroid.gapfilmtask.databinding.ContentItemLayoutBinding
import ir.tdroid.gapfilmtask.databinding.FragmentContentBinding
import ir.tdroid.gapfilmtask.model.Content
import ir.tdroid.gapfilmtask.ui.home.ContentListViewModel

@AndroidEntryPoint
class ContentFragment : BaseFragment<FragmentContentBinding>() {
    private val contentViewModel: ContentViewModel by viewModels()
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentContentBinding {
        return FragmentContentBinding.inflate(inflater, container, false)
    }
    var isFav = false
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        contentViewModel.getContent(GetContentRequest(GetContentRequest.Request(arguments?.getInt("id"))))
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }

        binding.fav.setOnClickListener {
            contentViewModel.toggleFavoriteContents(arguments?.getInt("id")!!)
        }

        contentViewModel.isFavoriteContents(arguments?.getInt("id")!!).observe(viewLifecycleOwner) {
            if (it.isNotEmpty()) {
                isFav = true
                binding.fav.setColorFilter(Color.parseColor("#C75450"))
            } else {
                isFav = false
                binding.fav.setColorFilter(Color.parseColor("#EAA9A9"))
            }

        }

        contentViewModel.contentLiveData.observe(viewLifecycleOwner) {

            when (it) {
                is Resource.Error -> {
                    binding.progressBar.visibility = View.GONE
                }
                Resource.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Resource.Success -> {
                    binding.progressBar.visibility = View.GONE
                    binding.toolbar.title = it.data.result?.title
                    binding.summery.text = it.data.result?.summary
                    Glide.with(requireContext())
                        .load(
                            it.data.result?.landscapeImage
                        )
                        .fitCenter()
                        .into(binding.landscaperImage)
                }
            }
        }


    }
}