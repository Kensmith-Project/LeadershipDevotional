package com.polish.leadershipdevotional.repository

import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import com.polish.leadershipdevotional.model.dao.LeadershipDevotionalDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LeadershipDevotionalRepository @Inject constructor(val leadershipDevotionalDao: LeadershipDevotionalDao) {

    val allDevotionals:Flow<List<LeadershipDevotionalEntity>> = leadershipDevotionalDao.getAllLeadershipDevotionals()

    // to insert to database
    suspend fun insert(leadershipDevotionalEntity: LeadershipDevotionalEntity) {
        leadershipDevotionalDao.insert(leadershipDevotionalEntity)
    }

}