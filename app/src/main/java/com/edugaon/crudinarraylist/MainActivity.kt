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
        val userNameList = arrayListOf("Ram", "Mohan", "Sohan", "Ram", "Mohan", "Sohan","Ram", "Mohan", "Sohan", "Ram", "Mohan", "Sohan","Ram", "Mohan", "Sohan","Ram", "Mohan", "Sohan")
        userListView.adapter =ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, userNameList )

        val addUserButton = findViewById<FloatingActionButton>(R.id.addUserButton)

        addUserButton.setOnClickListener {
            val addUserLayout = layoutInflater.inflate(R.layout.add_user_layout, null, false)

            val alertDialog = AlertDialog.Builder(this).create()
            alertDialog.setView(addUserLayout)
            alertDialog.show()

            val addNowButton = addUserLayout.findViewById<Button>(R.id.addNowBtn)
            val nameEditText = addUserLayout.findViewById<EditText>(R.id.nameEditText)
            addNowButton.setOnClickListener {

                userNameList.add(nameEditText.text.toString())
                userListView.adapter =ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, userNameList )

                alertDialog.dismiss()
            }



        }
//        userNameList.add("Geeta")
//        userNameList.remove("Mohan")
//       userNameList[0] = ""

    }
}