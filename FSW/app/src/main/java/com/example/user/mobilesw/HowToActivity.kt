package com.example.user.mobilesw

import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_howto.*

class HowToActivity : AppCompatActivity() {
    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_howto)

        button_back.setOnClickListener() {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}
