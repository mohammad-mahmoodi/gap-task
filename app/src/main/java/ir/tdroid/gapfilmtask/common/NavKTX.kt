package ir.tdroid.gapfilmtask.common

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import ir.tdroid.gapfilmtask.R

fun NavController.navigateAnim(@IdRes resId:Int,  args : Bundle? = null) {

   val nan =  NavOptions.Builder()
       .setEnterAnim(R.anim.anim_slide_enter)
       .setExitAnim(R.anim.anim_slide_exit)
       .setPopEnterAnim(R.anim.anim_slide_pop_enter)
       .setPopExitAnim(R.anim.anim_slide_pop_exit)
       .build()

    this.navigate(resId, args,nan)
}

fun Fragment.findAllNavControllers(): List<NavController> {
    val navControllers = mutableListOf<NavController>()
    var parent = parentFragment
    while (parent != null) {
        if (parent is NavHostFragment) {
            navControllers.add(parent.navController)
        }
        parent = parent.parentFragment
    }
    return navControllers
}