package com.droidmonk.beginkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_change_text.setOnClickListener {
            tv_hello.text = "Yay! I am a Kotlin expert";
        }

        btn_load_activity_b.setOnClickListener {

            val intent = Intent(this, ActivityB::class.java);
            intent.putExtra(ActivityB.KEY_MSG, "This msg has been sent from MainActivity")

            startActivity(intent);

        }
    }
}
