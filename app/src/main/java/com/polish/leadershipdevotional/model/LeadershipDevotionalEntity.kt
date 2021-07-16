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
                data.add(LeadershipDevotionalEntity(3, LeadershipDevotionalData.dayCount[2], LeadershipDevotionalData.bibleRef[2], LeadershipDevotionalData.bibleRefText[2], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[2]))
                data.add(LeadershipDevotionalEntity(4, LeadershipDevotionalData.dayCount[3], LeadershipDevotionalData.bibleRef[3], LeadershipDevotionalData.bibleRefText[3], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[3]))
                data.add(LeadershipDevotionalEntity(5, LeadershipDevotionalData.dayCount[4], LeadershipDevotionalData.bibleRef[4], LeadershipDevotionalData.bibleRefText[4], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[4]))
                data.add(LeadershipDevotionalEntity(6, LeadershipDevotionalData.dayCount[5], LeadershipDevotionalData.bibleRef[5], LeadershipDevotionalData.bibleRefText[5], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[5]))
                data.add(LeadershipDevotionalEntity(7, LeadershipDevotionalData.dayCount[6], LeadershipDevotionalData.bibleRef[6], LeadershipDevotionalData.bibleRefText[6], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[6]))
                data.add(LeadershipDevotionalEntity(8, LeadershipDevotionalData.dayCount[7], LeadershipDevotionalData.bibleRef[7], LeadershipDevotionalData.bibleRefText[7], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[7]))
                data.add(LeadershipDevotionalEntity(9, LeadershipDevotionalData.dayCount[8], LeadershipDevotionalData.bibleRef[8], LeadershipDevotionalData.bibleRefText[8], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[8]))
                data.add(LeadershipDevotionalEntity(10, LeadershipDevotionalData.dayCount[9], LeadershipDevotionalData.bibleRef[9], LeadershipDevotionalData.bibleRefText[9], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[9]))
                data.add(LeadershipDevotionalEntity(11, LeadershipDevotionalData.dayCount[10], LeadershipDevotionalData.bibleRef[10], LeadershipDevotionalData.bibleRefText[10], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[10]))
                data.add(LeadershipDevotionalEntity(12, LeadershipDevotionalData.dayCount[11], LeadershipDevotionalData.bibleRef[11], LeadershipDevotionalData.bibleRefText[11], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[11]))
                data.add(LeadershipDevotionalEntity(13, LeadershipDevotionalData.dayCount[12], LeadershipDevotionalData.bibleRef[12], LeadershipDevotionalData.bibleRefText[12], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[12]))
                data.add(LeadershipDevotionalEntity(14, LeadershipDevotionalData.dayCount[13], LeadershipDevotionalData.bibleRef[13], LeadershipDevotionalData.bibleRefText[13], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[13]))
                data.add(LeadershipDevotionalEntity(15, LeadershipDevotionalData.dayCount[14], LeadershipDevotionalData.bibleRef[14], LeadershipDevotionalData.bibleRefText[14], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[14]))
                data.add(LeadershipDevotionalEntity(16, LeadershipDevotionalData.dayCount[15], LeadershipDevotionalData.bibleRef[15], LeadershipDevotionalData.bibleRefText[15], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[15]))
                data.add(LeadershipDevotionalEntity(17, LeadershipDevotionalData.dayCount[16], LeadershipDevotionalData.bibleRef[16], LeadershipDevotionalData.bibleRefText[16], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[16]))
                data.add(LeadershipDevotionalEntity(18, LeadershipDevotionalData.dayCount[17], LeadershipDevotionalData.bibleRef[17], LeadershipDevotionalData.bibleRefText[17], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[17]))
                data.add(LeadershipDevotionalEntity(19, LeadershipDevotionalData.dayCount[18], LeadershipDevotionalData.bibleRef[18], LeadershipDevotionalData.bibleRefText[18], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[18]))
                data.add(LeadershipDevotionalEntity(20, LeadershipDevotionalData.dayCount[19], LeadershipDevotionalData.bibleRef[19], LeadershipDevotionalData.bibleRefText[19], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[20]))
                data.add(LeadershipDevotionalEntity(21, LeadershipDevotionalData.dayCount[20], LeadershipDevotionalData.bibleRef[20], LeadershipDevotionalData.bibleRefText[20], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[21]))
                data.add(LeadershipDevotionalEntity(22, LeadershipDevotionalData.dayCount[21], LeadershipDevotionalData.bibleRef[21], LeadershipDevotionalData.bibleRefText[21], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[21]))
                data.add(LeadershipDevotionalEntity(23, LeadershipDevotionalData.dayCount[22], LeadershipDevotionalData.bibleRef[22], LeadershipDevotionalData.bibleRefText[22], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[22]))
                data.add(LeadershipDevotionalEntity(24, LeadershipDevotionalData.dayCount[23], LeadershipDevotionalData.bibleRef[23], LeadershipDevotionalData.bibleRefText[23], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[23]))
                data.add(LeadershipDevotionalEntity(25, LeadershipDevotionalData.dayCount[24], LeadershipDevotionalData.bibleRef[24], LeadershipDevotionalData.bibleRefText[24], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[24]))
                data.add(LeadershipDevotionalEntity(26, LeadershipDevotionalData.dayCount[25], LeadershipDevotionalData.bibleRef[25], LeadershipDevotionalData.bibleRefText[25], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[25]))
                data.add(LeadershipDevotionalEntity(27, LeadershipDevotionalData.dayCount[26], LeadershipDevotionalData.bibleRef[26], LeadershipDevotionalData.bibleRefText[26], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[26]))
                data.add(LeadershipDevotionalEntity(28, LeadershipDevotionalData.dayCount[27], LeadershipDevotionalData.bibleRef[27], LeadershipDevotionalData.bibleRefText[27], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[27]))
                data.add(LeadershipDevotionalEntity(29, LeadershipDevotionalData.dayCount[28], LeadershipDevotionalData.bibleRef[28], LeadershipDevotionalData.bibleRefText[28], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[28]))
                data.add(LeadershipDevotionalEntity(30, LeadershipDevotionalData.dayCount[29], LeadershipDevotionalData.bibleRef[29], LeadershipDevotionalData.bibleRefText[29], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[29]))
                data.add(LeadershipDevotionalEntity(31, LeadershipDevotionalData.dayCount[30], LeadershipDevotionalData.bibleRef[30], LeadershipDevotionalData.bibleRefText[30], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[30]))
                data.add(LeadershipDevotionalEntity(32, LeadershipDevotionalData.dayCount[31], LeadershipDevotionalData.bibleRef[31], LeadershipDevotionalData.bibleRefText[31], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[31]))
                data.add(LeadershipDevotionalEntity(33, LeadershipDevotionalData.dayCount[32], LeadershipDevotionalData.bibleRef[32], LeadershipDevotionalData.bibleRefText[32], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[32]))
                data.add(LeadershipDevotionalEntity(34, LeadershipDevotionalData.dayCount[33], LeadershipDevotionalData.bibleRef[33], LeadershipDevotionalData.bibleRefText[33], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[33]))
                data.add(LeadershipDevotionalEntity(35, LeadershipDevotionalData.dayCount[34], LeadershipDevotionalData.bibleRef[34], LeadershipDevotionalData.bibleRefText[34], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[34]))
                data.add(LeadershipDevotionalEntity(36, LeadershipDevotionalData.dayCount[35], LeadershipDevotionalData.bibleRef[35], LeadershipDevotionalData.bibleRefText[35], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[35]))
                data.add(LeadershipDevotionalEntity(37, LeadershipDevotionalData.dayCount[36], LeadershipDevotionalData.bibleRef[36], LeadershipDevotionalData.bibleRefText[36], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[36]))
                data.add(LeadershipDevotionalEntity(38, LeadershipDevotionalData.dayCount[37], LeadershipDevotionalData.bibleRef[37], LeadershipDevotionalData.bibleRefText[37], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[37]))
                data.add(LeadershipDevotionalEntity(39, LeadershipDevotionalData.dayCount[38], LeadershipDevotionalData.bibleRef[38], LeadershipDevotionalData.bibleRefText[38], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[38]))
                data.add(LeadershipDevotionalEntity(40, LeadershipDevotionalData.dayCount[39], LeadershipDevotionalData.bibleRef[39], LeadershipDevotionalData.bibleRefText[39], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[39]))
                data.add(LeadershipDevotionalEntity(41, LeadershipDevotionalData.dayCount[40], LeadershipDevotionalData.bibleRef[40], LeadershipDevotionalData.bibleRefText[40], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[40]))
                data.add(LeadershipDevotionalEntity(42, LeadershipDevotionalData.dayCount[41], LeadershipDevotionalData.bibleRef[41], LeadershipDevotionalData.bibleRefText[41], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[41]))
                data.add(LeadershipDevotionalEntity(43, LeadershipDevotionalData.dayCount[42], LeadershipDevotionalData.bibleRef[42], LeadershipDevotionalData.bibleRefText[42], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[42]))
                data.add(LeadershipDevotionalEntity(44, LeadershipDevotionalData.dayCount[43], LeadershipDevotionalData.bibleRef[43], LeadershipDevotionalData.bibleRefText[43], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[43]))
                data.add(LeadershipDevotionalEntity(45, LeadershipDevotionalData.dayCount[44], LeadershipDevotionalData.bibleRef[44], LeadershipDevotionalData.bibleRefText[44], LeadershipDevotionalData.meditateTitle[0], LeadershipDevotionalData.meditateBody[44]))



//                data.add(LeadershipDevotionalEntity(1, LeadershipDevotionalData.dayCount[0],LeadershipDevotionalData.bibleRef[0], ))

                return data

            }
    }
}