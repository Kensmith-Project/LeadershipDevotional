package com.polish.leadershipdevotional.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import com.polish.leadershipdevotional.model.dao.LeadershipDevotionalDao

@Database(entities = [LeadershipDevotionalEntity::class], version = 1, exportSchema = false)
abstract class LeadersDevotionDatabase :RoomDatabase() {

    abstract fun leadershipDevotionalDao():LeadershipDevotionalDao

    companion object {
        val DATABASE_NAME:String = "leadership_devotional_database"
    }

}