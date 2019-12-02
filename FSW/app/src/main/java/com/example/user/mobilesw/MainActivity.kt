package com.example.user.mobilesw

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_start)
        button?.setOnClickListener {
            val intent: Intent = Intent(this, StageActivity::class.java)
            startActivity(intent)
        }
        button = findViewById(R.id.button_howto)
        button?.setOnClickListener() {
            val Intent2:Intent= Intent(this, HowToActivity::class.java)

            startActivity(Intent2)
        }

    }
}

