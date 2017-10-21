package com.droidmonk.beginkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
      /*
      //set onclick listener the traditional way
      btnChangeText.setOnClickListener(object:View.OnClickListener {
            override fun onClick(p0: View?) {
                tvHello.text="Yay! I am a Kotlin expert, but the traditional way";
            }
        })
*/
        btnLoadActivityB.setOnClickListener{
            val intent= Intent(this,ActivityB::class.java);
            startActivity(intent);
        }
    }
}
