package com.droidmonk.beginkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChangeText=findViewById(R.id.btn_change_text) as Button;
        val btnLoadActivityB=findViewById(R.id.btn_load_activity_b) as Button;
        val tvHello=findViewById(R.id.tv_hello) as TextView;

        btnChangeText.setOnClickListener {
            tvHello.text="Yay! I am a Kotlin expert";
        }

        btnLoadActivityB.setOnClickListener{
            val intent= Intent(this,ActivityB::class.java);
            startActivity(intent);
        }
    }
}
