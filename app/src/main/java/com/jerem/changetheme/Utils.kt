package com.jerem.changetheme

import android.app.Activity
import android.content.Intent
import android.util.Log

class Utils{

    companion object {
        const val THEME_LIGHT = "light"
        const val THEME_GREEN = "green"
        const val THEME_DARK = "dark"

        private var sTheme : String? = THEME_LIGHT


        fun changeToTheme(activity: Activity, theme : String?){
            val oldTheme = sTheme
            if(theme != null){
                sTheme = theme
            }
            if(theme != oldTheme) {
                activity.finish()
                activity.startActivity(Intent(activity, activity.javaClass))
                Log.d("DBG", "Theme changed")
            }else{
                Log.d("DBG", "Theme not changed")
            }
        }

        fun onActivityCreateSetTheme(activity: Activity){
            when(sTheme){
                THEME_GREEN -> activity.setTheme(R.style.AppTheme)
                THEME_DARK -> activity.setTheme(R.style.Dark)
                THEME_LIGHT -> activity.setTheme(R.style.Light)
                else -> activity.setTheme(R.style.Light)
            }
        }
    }




}

