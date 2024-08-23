package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.ChatModel
import com.example.recyclerview.R
import de.hdodenhof.circleimageview.CircleImageView

class RecViewAdapter :RecyclerView.Adapter<RecViewAdapter.ViewHolder>{
    private var arrUserList:ArrayList<ChatModel> = ArrayList();
    private var context:Context? = null

    constructor(context: Context?,arrUserList:ArrayList<ChatModel>) : super() {
        this.context = context
        this.arrUserList = arrUserList
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context!!).inflate(R.layout.row,parent,false))
    }

    override fun getItemCount(): Int {
        return arrUserList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvUserName.text =arrUserList[position].name

        Glide.with(context!!)
            .load(arrUserList[position].image)
//            .fitCenter()
            .circleCrop()
//            .centerCrop()
            //.placeholder(R.drawable.loading_spinner)
            .into(holder.ivUserImg);
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvUserName :TextView = itemView.findViewById(R.id.tvUserName);
        val ivUserImg : CircleImageView = itemView.findViewById(R.id.ivUserImg);
    }

}