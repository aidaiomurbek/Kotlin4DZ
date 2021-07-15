package com.example.kotlin4dz

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragment: FragmentActivity): FragmentStateAdapter(fragment) {

    private var list:ArrayList<Fragment> = arrayListOf()

    fun addItems(list: ArrayList<Fragment>){
        this.list.addAll(list)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list.get(position)
    }


}