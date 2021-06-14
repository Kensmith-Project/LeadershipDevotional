package com.polish.leadershipdevotional.model.database

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.asLiveData
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.platform.app.InstrumentationRegistry
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import com.polish.leadershipdevotional.model.dao.LeadershipDevotionalDao
import com.polish.leadershipdevotional.utils.getValue
import junit.framework.TestCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class LeadersDevotionDatabaseTest : TestCase(){
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    /**
     * declare the Dao and the leadershipDevotional database
     */
    private lateinit var leadershipDevotionalDao: LeadershipDevotionalDao
    private lateinit var db:LeadersDevotionDatabase

    /**
     * this @Before is required for initialization
     * of the database and the Dao
     */
    @Before
    fun setup(){
//        val context = ApplicationProvider.getApplicationContext<Context>()
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
                context, LeadersDevotionDatabase::class.java
        ).allowMainThreadQueries().build()
        leadershipDevotionalDao = db.leadershipDevotionalDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    fun writeAndReadDevotional() = runBlocking {
        // Given
        val firstDevotion = LeadershipDevotionalEntity(1, "DAY O1", "1TIMOTHY 1:1", "kING OF GLORY", "YOUR PRESENCE", "King of Glory fill this place, I just want to be where You are, just wnat a be where You are")
        // When
        leadershipDevotionalDao.insert(firstDevotion)

        val getListOfDevotional = leadershipDevotionalDao.getAllLeadershipDevotionals().asLiveData()
        // this extract the value from LiveData
        val extratedListFromLiveData = getValue(getListOfDevotional)
        //Then
        assert(extratedListFromLiveData.contains(firstDevotion))
    }



}