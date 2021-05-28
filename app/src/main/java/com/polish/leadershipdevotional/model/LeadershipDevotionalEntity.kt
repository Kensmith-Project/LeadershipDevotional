package com.polish.leadershipdevotional.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "devotion_table")
data class LeadershipDevotionalEntity(

    @PrimaryKey(autoGenerate = true) val id:Int,
    val dayCount:String,
    val bibleRef:String,
    val bibleRefText:String,
    val meditateTitle:String,
    val meditateBody:String
)