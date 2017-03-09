package com.dtkj.kotlindemo.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.dtkj.kotlindemo.R
import com.dtkj.kotlindemo.bases.BaseActivity
import kotlinx.android.synthetic.main.activity_weather.*

class WeatherActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        initViews()
        initDatas()
        initListeners()
    }

    fun initViews() {
        rv_weather.layoutManager = LinearLayoutManager(this)
    }

    fun initDatas() {

    }

    fun initListeners() {

    }
}
