package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class UserAdapter(private val userList: MutableList<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val avatarView: ImageView = view.findViewById<ImageView>(R.id.avatarView)
        val loginView: TextView = view.findViewById<TextView>(R.id.loginView)
        val mailView: TextView = view.findViewById<TextView>(R.id.mailView)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.user_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.avatarView.setImageResource(R.mipmap.ic_launcher)
        viewHolder.loginView.text = userList[position].login
        viewHolder.mailView.text = userList[position].mail
    }

    override fun getItemCount() = userList.size

}

