package com.tenpearls.eventorganizerappkotlin.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tenpearls.eventorganizerappkotlin.Activities.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
