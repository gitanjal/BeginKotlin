package com.droidmonk.beginkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.tv_msg

class ActivityB : AppCompatActivity() {

    companion object {
        const val KEY_MSG="msg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val msg=intent.getStringExtra(KEY_MSG)
        tv_msg.text=msg

    }
}
