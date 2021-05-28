package com.polish.leadershipdevotional.model.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LeadershipDevotionalDao {
    /**
     * to read all the items of the Leadership devotional
     */
    @Query("SELECT * FROM devotion_table ORDER BY id ASC")
    fun getAllLeadershipDevotionals(): Flow<List<LeadershipDevotionalEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(leadershipDevotionalEntity: LeadershipDevotionalEntity)

}