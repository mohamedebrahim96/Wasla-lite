package com.example.mohamed.wasla.utils

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import com.example.mohamed.wasla.R
import com.example.mohamed.wasla.model.docker
import kotlinx.android.synthetic.main.list_item.view.*


class AnimalAdapter(val items : ArrayList<docker>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(from(context).inflate(R.layout.list_item, p0, false))
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.imageType?.setImageResource(items.get(p1).icon)
        p0?.title_option?.setText(items.get(p1).title)

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val imageType = view.image
    val title_option = view.title_option

}