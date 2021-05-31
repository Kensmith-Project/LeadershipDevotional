package com.polish.leadershipdevotional.repository

import androidx.lifecycle.LiveData
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import com.polish.leadershipdevotional.model.dao.LeadershipDevotionalDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LeadershipDevotionalRepositoryImpl @Inject constructor(val leadershipDevotionalDao: LeadershipDevotionalDao): ILeadershipDevotionalRepository {

    override fun getAllLeadershipDevotional(): Flow<List<LeadershipDevotionalEntity>> {
       return leadershipDevotionalDao.getAllLeadershipDevotionals()
    }

    override suspend fun insert(leadershipDevotional: LeadershipDevotionalEntity) {
         withContext(Dispatchers.IO){
            leadershipDevotionalDao.insert(leadershipDevotional)
        }
    }

    override fun checkDBContentNow(): LiveData<LeadershipDevotionalEntity> {
        return leadershipDevotionalDao.loadLeadershipDevotional()
    }


}