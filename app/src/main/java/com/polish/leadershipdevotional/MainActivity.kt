package com.polish.leadershipdevotional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.polish.leadershipdevotional.adapter.LeadershipDevotionalAdapter
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import com.polish.leadershipdevotional.viewmodel.LeadershipDevotionalViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val TAG = "MAIN_ACTIVITY"
    /**
     * declare views
     */
    lateinit var dsRecyclerView:RecyclerView
    lateinit var myAdapter:LeadershipDevotionalAdapter
    /**
     * LeadershipDevotional viewmodel reference
     */
    val leadershipDevotionalViewModel:LeadershipDevotionalViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * initialize views
         */
        dsRecyclerView = findViewById(R.id.activity_main_myRecyclerview_rv)
        dsRecyclerView.layoutManager = LinearLayoutManager(this)

        /**
         * get a list of data
         */
        val someDevotionals = LeadershipDevotionalEntity.leaderDevotionalData
        // to write a logic
        // to check if database is empty
        // if empty, then allow

        // now if this result is true or false
        // when database is empty, write to the database
        if (leadershipDevotionalViewModel.CheckDBContent()){
            // write to the db
            for(devotion in someDevotionals){
                leadershipDevotionalViewModel.insertLeadershipDevotional(devotion)
            }
        }


        /**
         * observe the database
         */
        leadershipDevotionalViewModel.allLeadershipDevotional.observe(this, Observer { devotional ->
            Log.d(TAG, "here are the content in the devotion: $devotional")
            myAdapter = LeadershipDevotionalAdapter(devotional, LeadershipDevotionalAdapter.OnClickListener { leadershipDevotionalEntity ->
                Snackbar.make(findViewById(R.id.activity_main_major_layout), "You clicked me; $leadershipDevotionalEntity", Snackbar.LENGTH_LONG).show()
                startActivity(Intent(this, DetailedDevotionalActivity::class.java))
//                devotionSelected(devotional[0]) // testing how alert-Dialog works
            })
            dsRecyclerView.adapter = myAdapter
            myAdapter.notifyDataSetChanged()
        })
    }

    // add an alert dialog
    private fun devotionSelected(devotion:LeadershipDevotionalEntity) {
        AlertDialog.Builder(this)
                .setTitle(devotion.dayCount)
                .setMessage(devotion.meditateBody)
                .setPositiveButton("Delete", {_,_ ->

                })
                .setNegativeButton("Cancel", {dialog, _-> dialog.cancel()})
                .create()
                .show()
    }
}