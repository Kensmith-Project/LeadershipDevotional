package com.polish.leadershipdevotional.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.polish.leadershipdevotional.R

class LeadershipDevotionalAdapter(): RecyclerView.Adapter<LeadershipDevotionalAdapter.LeadershipDevotionalViewHolder>() {

    /**
     * this is the view-holder class
     */
    class LeadershipDevotionalViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        /**
         * initialize the views
         */
        val dayCount:TextView = itemView.findViewById(R.id.item_list_day_count_tv)
        val bibleRef:TextView = itemView.findViewById(R.id.item_list_bible_ref_tv)
        val bibleRefText:TextView = itemView.findViewById(R.id.item_list_bible_text_refer_tv)

        /**
         * this method binds the data to the views
         */
        fun bind(){

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LeadershipDevotionalViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: LeadershipDevotionalViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}