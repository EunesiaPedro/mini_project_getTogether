package com.tech4dev.gettogether

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> {
                Toast.makeText(this, "search click", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.New_group -> {
                goToNewGroupActivity()
                return true
            }

            R.id.New_broadcast -> {
                goToNewBroadcastActivity()
                return true
            }
            R.id.Linked_devices -> {
                goToLinkedDevicesActivity()
                return true
            }
            R.id.Starred_messages -> {
                gotoStarredMessagesActivity()
                return true
            }
            R.id.settings -> {
                goToSettingActivity()
                return true

            }
            else -> {
                return false
            }
        }
    }
            private fun goToNewGroupActivity(){
                val i = Intent(this, NewGroupActivity::class.java)
                startActivity(i)
            }
            private fun goToNewBroadcastActivity(){
                val i = Intent(this,NewBroadcastActivity::class.java )
                startActivity(i)
            }
            private fun goToLinkedDevicesActivity(){
            val i = Intent(this,LinkedDevicesActivity::class.java )
                startActivity(i)
    }
           private fun gotoStarredMessagesActivity(){
           val i = Intent(this,StarredMessageActivity::class.java )
               startActivity(i)
    }
    private fun goToSettingActivity(){
        val i = Intent(this,SettingActivity::class.java )
        startActivity(i)
    }
        }


