package ir.tdroid.gapfilmtask.common

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import ir.tdroid.gapfilmtask.R

fun customToast(context: Context? , mes : String? , duration : Int) {

    val layout: View =(context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
        .inflate(R.layout.toast_custom_layout, null)

    val txtMessage = layout.findViewById<TextView>(R.id.txtMessage)

    txtMessage.setText(mes)

    val toast = Toast(context)
    toast.duration = duration
    toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 64)
    toast.view = layout
    toast.show()
}