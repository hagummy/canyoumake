package com.example.canyoumake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.canyoumake.User.Usermainactivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user=findViewById<Button>(R.id.btn_user)
        val company=findViewById<Button>(R.id.btn_com)

        user.setOnClickListener{
            val intent= Intent(this,Usermainactivity::class.java)
            startActivity(intent)
        }
    }
}