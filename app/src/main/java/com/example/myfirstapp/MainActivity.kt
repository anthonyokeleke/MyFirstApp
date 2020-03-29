package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_name = findViewById<Button>(R.id.button_name)
        val button_slack = findViewById<Button>(R.id.button_slack)
        val button_email = findViewById<Button>(R.id.button_email)
        val button_tracks = findViewById<Button>(R.id.button_tracks)

        button_name.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        button_slack.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
        button_email.setOnClickListener {
            val intent = Intent(this, Activity4::class.java)
            startActivity(intent)
        }
        button_tracks.setOnClickListener {
            val intent = Intent(this, Activity5::class.java)
            startActivity(intent)
        }
    }

    fun onClick(view: View) {}
}
