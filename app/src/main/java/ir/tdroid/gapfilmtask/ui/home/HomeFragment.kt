package ir.tdroid.gapfilmtask.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import ir.tdroid.gapfilmtask.base.BaseFragment
import ir.tdroid.gapfilmtask.databinding.FragmentFavouriteListBinding
import ir.tdroid.gapfilmtask.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       val demoCollectionAdapter = DemoCollectionAdapter(this)
        binding.pager.adapter = demoCollectionAdapter

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            tab.text = when(position) {
                0-> "لیست"
                1-> "علاقه مندی ها"
                else ->""
            }
        }.attach()

    }

}

class DemoCollectionAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> ContentListFragment()
            1-> FavouriteListFragment()
            else -> ContentListFragment()
        }

    }
}
