package com.example.kotlin4dz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : FragmentActivity() {
    private lateinit var adapter: PagerAdapter
    private lateinit var viewPader :ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list:ArrayList<Fragment> = arrayListOf()
        list.add(FirstFragment())
        list.add(SecondFragment())
        list.add(ThirdFragment())



        adapter = PagerAdapter(this)
        adapter.addItems(list)
        viewPader = findViewById(R.id.view_pager)
        viewPader.adapter = adapter


    }
}