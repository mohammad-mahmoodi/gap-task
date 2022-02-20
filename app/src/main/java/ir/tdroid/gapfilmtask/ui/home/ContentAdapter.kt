package ir.tdroid.gapfilmtask.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.tdroid.gapfilmtask.databinding.ContentItemLayoutBinding
import ir.tdroid.gapfilmtask.model.Content

class ContentAdapter() :
    ListAdapter<Content, ContentAdapter.ContentViewHolder>(BusinessDiffCallback()) {


    lateinit var onItemSelected: (Content) -> Unit


    class ContentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ContentItemLayoutBinding.bind(itemView)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ContentViewHolder {

        return ContentViewHolder(
            ContentItemLayoutBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            ).root
        )

    }

    override fun onBindViewHolder(viewHolder: ContentViewHolder, position: Int) {
        val item = getItem(position)

        viewHolder.binding.textName.text = item?.title
        viewHolder.binding.txtType.text = when(item?.ZoneId){
            3 -> "سریال"
            4 -> "فیلم سینمایی"
            else ->""
        }

        Glide.with(viewHolder.binding.imageView)
            .load(
                item.landscapeImage
            )
            .into(viewHolder.binding.imageView)

    }

}


class BusinessDiffCallback : DiffUtil.ItemCallback<Content>() {

    override fun areItemsTheSame(oldItem: Content, newItem: Content): Boolean {
        return oldItem.ContentID == newItem.ContentID
    }


    override fun areContentsTheSame(oldItem: Content, newItem: Content): Boolean {
        return oldItem == newItem
    }


}