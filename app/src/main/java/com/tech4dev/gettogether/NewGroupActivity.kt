package com.tech4dev.gettogether

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewGroupActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)

        recyclerView = findViewById(R.id.listOfFriends)
        recyclerView.adapter = ListOfFriendsAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}