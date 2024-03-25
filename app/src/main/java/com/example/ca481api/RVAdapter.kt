package com.example.ca481api

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RVAdapter (private val dataList: List<DataAPIItem>):RecyclerView.Adapter<RVAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
    val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.item_design,parent,false)
    return ViewHolder(view)
}

 override fun onBindViewHolder(holder:ViewHolder,position: Int) {
     val item = dataList[position]
     holder.tvID.text = "ID: " + item.id.toString()
     holder.tvUserID.text = "UserID: " + item.userId.toString()
     holder.tvTitle.text = "Title: " + item.title.toString()
 }


  override fun getItemCount(): Int {
      return dataList.size
  }
  inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
      val tvID: TextView = itemView.findViewById(R.id.tvid)
      val tvUserID: TextView = itemView.findViewById(R.id.tvuserid)
      val tvTitle: TextView = itemView.findViewById(R.id.tvtitle)


      init{
          itemView.setOnClickListener{
              Toast.makeText(itemView.context,"You have clicked ${dataList[adapterPosition]}",Toast.LENGTH_LONG).show()
          }
      }
}}