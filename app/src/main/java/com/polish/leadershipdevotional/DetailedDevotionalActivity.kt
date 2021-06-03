package com.polish.leadershipdevotional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class DetailedDevotionalActivity : AppCompatActivity() {
    /**
     * declare views
     */
    lateinit var myToolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_devotional)
        /**
         * initialize view
         */
        myToolbar = findViewById(R.id.activity_detailed_tool_bar_tb)
        setSupportActionBar(myToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    /**
     * this handles the back icon
     */
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}