package com.dtkj.kotlindemo.bases

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }
}
