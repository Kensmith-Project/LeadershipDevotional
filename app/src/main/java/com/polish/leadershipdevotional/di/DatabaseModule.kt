package com.polish.leadershipdevotional.di

import android.content.Context
import androidx.room.Room
import com.polish.leadershipdevotional.model.dao.LeadershipDevotionalDao
import com.polish.leadershipdevotional.model.database.LeadersDevotionDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideLeadershipDevotionalDatabase(@ApplicationContext context: Context): LeadersDevotionDatabase {
        return Room.databaseBuilder(
            context,
            LeadersDevotionDatabase::class.java,
            LeadersDevotionDatabase.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideLEadershipDevotionDao(leadershipDevotionalDatabase:LeadersDevotionDatabase): LeadershipDevotionalDao {
        return leadershipDevotionalDatabase.leadershipDevotionalDao()
    }

}