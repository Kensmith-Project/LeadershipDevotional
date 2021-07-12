package com.polish.leadershipdevotional.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.polish.leadershipdevotional.model.leadershipdevotiondata.LeadershipDevotionalData

@Entity(tableName = "devotion_table")
data class LeadershipDevotionalEntity(

    @PrimaryKey(autoGenerate = true) val id:Int,
    val dayCount:String,
    val bibleRef:String,
    val bibleRefText:String,
    val meditateTitle:String,
    val meditateBody:String
) {
    // pregenerated data
    companion object {
        val leaderDevotionalData:ArrayList<LeadershipDevotionalEntity>
            get() {
                val data = ArrayList<LeadershipDevotionalEntity>()
                data.add(LeadershipDevotionalEntity(1, LeadershipDevotionalData.dayCount[0], LeadershipDevotionalData.bibleRef[0], LeadershipDevotionalData.bibleRefText[0], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[0]))
                data.add(LeadershipDevotionalEntity(2, LeadershipDevotionalData.dayCount[1], LeadershipDevotionalData.bibleRef[1], LeadershipDevotionalData.bibleRefText[1], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[1]))

//                data.add(LeadershipDevotionalEntity(1, LeadershipDevotionalData.dayCount[0],LeadershipDevotionalData.bibleRef[0], ))

                return data

            }
    }
}