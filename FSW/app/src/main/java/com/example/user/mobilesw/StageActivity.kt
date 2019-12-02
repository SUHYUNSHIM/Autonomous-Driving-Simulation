package com.example.user.mobilesw

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_stage.*

class StageActivity : AppCompatActivity() {

    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage)

        imageButton_st1.setOnClickListener(){
            val st1Intent= Intent(this,SensorActivity::class.java)
            st1Intent.putExtra("stage",1)
            startActivity(st1Intent)
        }
        imageButton_st2.setOnClickListener(){
            val st2Intent= Intent(this,SensorActivity::class.java)
            st2Intent.putExtra("stage",2)
            startActivity(st2Intent)
        }
        imageButton_st3.setOnClickListener(){
            val st3Intent= Intent(this,SensorActivity::class.java)
            st3Intent.putExtra("stage",3)
            startActivity(st3Intent)
        }
        imageButton_st4.setOnClickListener(){
            val st4Intent= Intent(this,SensorActivity::class.java)
            st4Intent.putExtra("stage",4)
            startActivity(st4Intent)
    }
        imageButton_st5.setOnClickListener(){
            val st5Intent= Intent(this,SensorActivity::class.java)
            st5Intent.putExtra("stage",5)
            startActivity(st5Intent)
        }
    }

 }


