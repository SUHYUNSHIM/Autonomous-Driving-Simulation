package com.example.user.mobilesw

import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Handler
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var handler : Handler = Handler()

        handler.postDelayed({

            var intent : Intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
