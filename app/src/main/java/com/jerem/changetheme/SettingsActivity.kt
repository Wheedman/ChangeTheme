package com.jerem.changetheme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val settingsFragment = SettingsFragment()

        supportFragmentManager.beginTransaction().add(R.id.settingsContainer, settingsFragment).commit()
    }


}
