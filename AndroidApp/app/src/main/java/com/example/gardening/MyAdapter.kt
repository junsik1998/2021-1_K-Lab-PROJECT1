package com.example.gardening

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions

class MyAdapter(options: FirebaseRecyclerOptions<ActivityRowComponent>):
    FirebaseRecyclerAdapter<ActivityRowComponent, MyAdapter.ViewHolder>(options) {

    interface OnItemClickListener{
        fun OnItemClick(holder:ViewHolder, view:View, position: Int)
    }
    interface OnButtonClickListener{
        fun OnButtonClick(holder:ViewHolder, view:View, position: Int)
    }
    var itemClickListener:OnItemClickListener?=null
    var buttonClickListener:OnButtonClickListener?=null
    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val title:TextView = itemView.findViewById(R.id.activityRowTitle)
        val date:TextView = itemView.findViewById(R.id.activityRowDate)
        val participantNum:TextView = itemView.findViewById(R.id.activityRowParticipantNum)
        var content = ""
        var aId = -1
        var currentNum = -1
        var fullNum = -1
        var comment = ""
        var selected = 0
        val joinBtn = itemView.findViewById(R.id.activityJoinBtn) as Button

        init{

            itemView.setOnClickListener {
                itemClickListener?.OnItemClick(this,it,adapterPosition)

            }
            joinBtn.setOnClickListener {
                buttonClickListener?.OnButtonClick(this,it,adapterPosition)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, activityRow : ActivityRowComponent) {
            holder.title.text = activityRow.aTitle
            holder.date.text = activityRow.aDate
            holder.aId = activityRow.aId
            holder.content = activityRow.aContent
            holder.comment = activityRow.aComment
            holder.currentNum = activityRow.aCurrentParticipantNum
            holder.fullNum = activityRow.aFullParticipantNum
            holder.selected = activityRow.selected
            holder.participantNum.text = activityRow.aCurrentParticipantNum.toString() + "/" + activityRow.aFullParticipantNum.toString()
    }
}