package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = mutableListOf<User>()

        for (i in 0..10) {
            users.add(User("user$i", "url", "mail$i", "login$i"))
        }
        print(users)

        val recyclerView = findViewById<RecyclerView>(R.id.users_list)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        val adapter = UserAdapter(users)
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}