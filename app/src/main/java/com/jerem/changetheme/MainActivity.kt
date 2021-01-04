package com.jerem.changetheme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.onActivityCreateSetTheme(this)
        //loadPreferences()

        setContentView(R.layout.activity_main)




        button1.setOnClickListener {
            Utils.changeToTheme(this, Utils.THEME_GREEN)
        }

        button2.setOnClickListener {
            Utils.changeToTheme(this, Utils.THEME_DARK)
        }

        button3.setOnClickListener {
            Utils.changeToTheme(this, Utils.THEME_LIGHT)
        }

        settings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        reloadTheme()
        loadPreferences()
    }

    private fun loadPreferences(){
        //val sp = PreferenceManager.getDefaultSharedPreferences(this)
        //TODO: Loading different preferences if there are some
    }

    private fun reloadTheme(){
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        val theme = sp.getString("pref_bc_key", Utils.THEME_LIGHT)
        Utils.changeToTheme(this, theme)
    }

}
