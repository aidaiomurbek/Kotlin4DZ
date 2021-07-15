package com.example.kotlin4dz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CounterAdapter : RecyclerView.Adapter<CounterAdapter.CounterVH>() {

    private var list:ArrayList<String> = arrayListOf()
    fun addItem(item:String){
        list.add(item)
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CounterVH {
        return CounterVH(LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false))
    }

    override fun onBindViewHolder(holder: CounterVH, position: Int) {
        holder.onBind(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class CounterVH(item: View): RecyclerView.ViewHolder(item) {
        lateinit var textView : TextView
        fun onBind(get: String) {
            textView= itemView.findViewById(R.id.tv_item_view)
            textView.setText(get.toString())

        }

    }


}