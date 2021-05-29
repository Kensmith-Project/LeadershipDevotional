package com.polish.leadershipdevotional.repository

import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import kotlinx.coroutines.flow.Flow

interface ILeadershipDevotionalRepository {

    /**
     * get all the leadership devotional
     */
    fun getAllLeadershipDevotional(): Flow<List<LeadershipDevotionalEntity>>

    /**
     * add all the leadership devotional
     */
    suspend fun insert(leadershipDevotional:LeadershipDevotionalEntity)

}