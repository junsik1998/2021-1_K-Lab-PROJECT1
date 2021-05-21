package com.example.gardening

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions

class MyAdapter(options: FirebaseRecyclerOptions<ActivityRowComponent>):
    FirebaseRecyclerAdapter<ActivityRowComponent, MyAdapter.ViewHolder>(options) {

    interface OnItemClickListener{
        fun OnItemClick(view: View, position: Int)
    }

    var itemClickListener:OnItemClickListener?=null

    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val title:TextView = itemView.findViewById(R.id.activityRowTitle)
        val date:TextView = itemView.findViewById(R.id.activityRowDate)
        val participantNum:TextView = itemView.findViewById(R.id.activityRowParticipantNum)
        init{

            itemView.setOnClickListener {
                itemClickListener?.OnItemClick(it,adapterPosition)

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
            holder.participantNum.text = activityRow.aCurrentParticipantNum.toString() + "/" + activityRow.aFullParticipantNum.toString()
    }
}