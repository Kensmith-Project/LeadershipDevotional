package com.polish.leadershipdevotional.di

import com.polish.leadershipdevotional.model.dao.LeadershipDevotionalDao
import com.polish.leadershipdevotional.repository.ILeadershipDevotionalRepository
import com.polish.leadershipdevotional.repository.LeadershipDevotionalRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideLeadershipRepository(leadershipDevotionalDao: LeadershipDevotionalDao): ILeadershipDevotionalRepository {
        return LeadershipDevotionalRepositoryImpl(leadershipDevotionalDao)
    }

}