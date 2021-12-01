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

class vpadapter(val context: Context, val array: ArrayList<Pics>) : RecyclerView.Adapter<vpadapter.MyVH>(){
    class MyVH(view: View) : RecyclerView.ViewHolder(view) {
        val image :ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.vpadapter,parent,false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.image.setImageResource(list.list[position].image)
    }

    override fun getItemCount(): Int {
        return array.size
    }

}

