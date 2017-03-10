package com.dtkj.kotlindemo.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.dtkj.kotlindemo.R
import com.dtkj.kotlindemo.bases.BaseActivity
import com.dtkj.kotlindemo.ui.adapters.WeatherAdapter
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
        var weathers = listOf(
                "周一：6/23",
                "周二：3/17",
                "周三：3/19",
                "周四：3/22",
                "周五：4/15",
                "周六：1/12",
                "周日：5/10"
        )
        rv_weather.adapter = WeatherAdapter(weathers)
//        doAsync {
//            var result = WeatherRequest(url).getWeather()
//            toast(result)
//        }
//        doAsyncResult {
//            var result = WeatherRequest(url).getWeather()
//            toast(result)
//        }
    }

    fun initListeners() {

    }
}
