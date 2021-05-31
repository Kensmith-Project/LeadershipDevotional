package com.polish.leadershipdevotional.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.polish.leadershipdevotional.R
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity

class LeadershipDevotionalAdapter(val devotionItems:List<LeadershipDevotionalEntity>): RecyclerView.Adapter<LeadershipDevotionalAdapter.LeadershipDevotionalViewHolder>() {

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
        fun bind(devotionItem:LeadershipDevotionalEntity){
            dayCount.text = devotionItem.dayCount.toString()
            bibleRef.text = devotionItem.bibleRef.toString()
            bibleRefText.text = devotionItem.bibleRefText.toString()
        }
    }

    /**
     * this is to inflate the item_list layout
     */
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LeadershipDevotionalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return LeadershipDevotionalViewHolder(view)
    }

    /**
     * this is to set the data to the views
     */
    override fun onBindViewHolder(holder: LeadershipDevotionalViewHolder, position: Int) {
        /**
         * get an item in the array using its index position in the array
         */
        val currentItem = devotionItems[position]
        holder.bind(currentItem)
    }

    /**
     * get the count
     */
    override fun getItemCount(): Int {
        return devotionItems.size
    }

}