package com.dtkj.kotlindemo.https

import java.net.URL

/**
 * Created by sword on 17/3/9.
 * Description:
 */
public class WeatherRequest(val url: String) {
    public fun getWeather(): String {
        val result = URL(url).readText()
        return result
    }
}