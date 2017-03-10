package com.dtkj.kotlindemo.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by sword on 17/3/9.
 * Description:
 */
public class WeatherAdapter(val itemList: List<String>) : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = itemList[position]
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    class ViewHolder(val itemTitle: TextView) : RecyclerView.ViewHolder(itemTitle)

}