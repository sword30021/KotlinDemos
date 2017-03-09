package com.dtkj.kotlindemo.ui

import android.content.Intent
import android.os.Bundle
import com.dtkj.kotlindemo.R
import com.dtkj.kotlindemo.bases.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initData()
        initListeners()
    }

    fun initViews() {

    }

    fun initData() {
        tv_content.text = add(1, 2).toString()
        tv_content.text = getInfo()
    }

    fun initListeners() {
        tv_content.setOnClickListener { toast(tv_content.text.toString()) }
        btn_weather.setOnClickListener { startActivity(Intent(MainActivity@ this, WeatherActivity::class.java)) }
    }

    fun add(x: Int, y: Int): Int = x + y

    fun getInfo(): String = "Hello Kotlin"
}
