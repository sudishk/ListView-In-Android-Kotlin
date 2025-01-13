package com.edugaon.crudinarraylist

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val userListView = findViewById<ListView>(R.id.userListView)
        val userNameList = arrayListOf("Ram", "Mohan", "Sohan", "Ram", "Mohan", "Sohan","Ram", "Mohan", "Sohan", "Ram", "Mohan", "Sohan","Ram", "Mohan", "Sohan","Ram", "Mohan", "Sohan") // user list for
        userListView.adapter =ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, userNameList )  // adding Adapter to list view for showing data with itemLayout

//        userNameList.add("Geeta")
//        userNameList.remove("Mohan")
//       userNameList[0] = ""

    }
}