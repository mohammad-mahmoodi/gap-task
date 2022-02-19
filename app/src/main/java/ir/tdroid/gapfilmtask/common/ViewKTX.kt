package ir.tdroid.gapfilmtask.common;

import android.view.View
import androidx.constraintlayout.widget.Group

fun View.state(resource: Resource<Any>) {
    when (resource) {
        is Resource.Error -> this.isEnabled = true
        is Resource.Loading -> this.isEnabled = false
        is Resource.Success -> this.isEnabled = true
    }
}


fun Group.setAllOnClickListener(listener: View.OnClickListener?) {
    referencedIds.forEach { id ->
        rootView.findViewById<View>(id).setOnClickListener(listener)
    }
}