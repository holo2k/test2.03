package com.example.test20

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class vpadapter(val context: Context, val arrayList: ArrayList<Pics>):RecyclerView.Adapter<vpadapter.MyVH>() {
    class MyVH(val view: View) :RecyclerView.ViewHolder(view){
        val Pic : ImageView = view.findViewById(R.id.imageView)
        val Text : TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.vpadapter,parent,false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.Pic.setImageResource(list.list[position].image)
        holder.Text.text = list.list[position].text
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}