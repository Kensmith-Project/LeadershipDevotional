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
                data.add(LeadershipDevotionalEntity(1, "Day 1", "1 Timothy 1:1", "For example, I can do all things through Christ who strenghtens me", "Meditate", "Great grace was given to them"))
                data.add(LeadershipDevotionalEntity(2, "Day 2", "1 Timothy 2:1", "For illustration, arise and shine", "Mediate", "The Lord be praise forever and ever"))

//                data.add(LeadershipDevotionalEntity(1, LeadershipDevotionalData.dayCount[0],LeadershipDevotionalData.bibleRef[0], ))

                return data

            }
    }
}