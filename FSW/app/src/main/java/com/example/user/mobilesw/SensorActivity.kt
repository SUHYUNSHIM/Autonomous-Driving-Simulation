package com.example.user.mobilesw

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent.getIntent
import android.content.Intent
import android.widget.Button


class SensorActivity : AppCompatActivity() {

    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor)

        val stage by lazy { intent.extras["stage"] as Int }

        button = findViewById(R.id.button_hint)
        button?.setOnClickListener() {
            val Intent3:Intent= Intent(this, HintActivity::class.java)
            startActivity(Intent3)
        }
    }
}

