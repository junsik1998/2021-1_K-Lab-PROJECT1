package com.example.gardening

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions
import java.util.*

class MyAdapter2(options: FirebaseRecyclerOptions<ActivityRowComponent>):
        FirebaseRecyclerAdapter<ActivityRowComponent, MyAdapter2.ViewHolder>(options) {

    interface OnItemClickListener{
        fun OnItemClick(holder:ViewHolder, view: View, position: Int)
    }
    interface OnButtonClickListener{
        fun OnButtonClick(holder:ViewHolder, view: View, position: Int)
    }
    var itemClickListener:OnItemClickListener?=null
    var buttonClickListener:OnButtonClickListener?=null
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.myactivityRowTitle)
        val date: TextView = itemView.findViewById(R.id.myactivityRowDate)
        val participantNum: TextView = itemView.findViewById(R.id.myactivityRowParticipantNum)
        var content = ""
        var aId = -1
        var currentNum = -1
        var fullNum = -1
        var comment = ""
        var selected = 0
        val joinBtn = itemView.findViewById(R.id.myactivityJoinBtn) as Button

        init{

            itemView.setOnClickListener {
                itemClickListener?.OnItemClick(this,it,adapterPosition)

            }
            joinBtn.setOnClickListener {
                buttonClickListener?.OnButtonClick(this,it,adapterPosition)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.myrow, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyAdapter2.ViewHolder, position: Int, activityRow: ActivityRowComponent) {
        holder.title.text = activityRow.aTitle
        holder.date.text = activityRow.aDate
        holder.aId = activityRow.aId
        holder.content = activityRow.aContent
        holder.comment = activityRow.aComment
        holder.currentNum = activityRow.aCurrentParticipantNum
        holder.fullNum = activityRow.aFullParticipantNum
        var participantNum = ""
        for( i in  1..activityRow.aCurrentParticipantNum){
            participantNum += "●"

        }
        for( i in  1..(activityRow.aFullParticipantNum-activityRow.aCurrentParticipantNum)){
            participantNum += "○"

        }
        val content = setEachTextColor(participantNum, holder.currentNum)
        holder.participantNum.setText(content)
    }
    private fun setEachTextColor(string:String, num:Int) : SpannableStringBuilder {
        var rnd = Random()

        val spannable = SpannableStringBuilder(string)
        for(i in 0..num-1){
            spannable.setSpan(
                ForegroundColorSpan(Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256))),
                i,
                i+1,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
        return spannable
    }

}