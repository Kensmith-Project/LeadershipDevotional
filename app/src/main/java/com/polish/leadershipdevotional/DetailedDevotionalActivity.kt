package com.polish.leadershipdevotional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity

class DetailedDevotionalActivity : AppCompatActivity() {
    /**
     * declare views and variables
     */
    lateinit var myToolbar: Toolbar
    lateinit var displayDayCount:TextView
    lateinit var displayBibleRef:TextView
    lateinit var displayBibleRefText:TextView
    lateinit var displayMeditateTitle:TextView
    lateinit var displayMeditateBody:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_devotional)
        /**
         * initialize view and variables
         */
        myToolbar = findViewById(R.id.activity_detailed_tool_bar_tb)
        setSupportActionBar(myToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        displayDayCount = findViewById(R.id.activity_detailed_day_count_tv)
        displayBibleRef = findViewById(R.id.activity_detailed_bible_ref_tv)
        displayBibleRefText = findViewById(R.id.activity_detailed_bible_ref_content)
        displayMeditateTitle = findViewById(R.id.activity_detailed_meditate_title_tv)
        displayMeditateBody = findViewById(R.id.activity_detailed_meditate_body_tv)

        /**
         * receive the intent sent
         */
        val receiveIntent = intent
        val selectedDevotion = receiveIntent.getParcelableExtra<LeadershipDevotionalEntity>(SELECTED_DEVOTION)
        // set the data the the view
        displayDayCount.text = selectedDevotion?.dayCount.toString()
        displayBibleRef.text = selectedDevotion?.bibleRef.toString()
        displayBibleRefText.text = selectedDevotion?.bibleRefText.toString()
        displayMeditateTitle.text = selectedDevotion?.meditateTitle.toString()
        displayMeditateBody.text = selectedDevotion?.meditateBody.toString()

    }

    /**
     * this handles the back icon
     */
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val SELECTED_DEVOTION = "content"
    }



}