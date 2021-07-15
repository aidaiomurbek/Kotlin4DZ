package com.example.kotlin4dz

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter = MutableLiveData<Int>()
    var signs = MutableLiveData<String>()
    private var i :Int = 0

    fun plus(){
        counter.value = i++
        signs.value= "+"
    }

    fun minus(){
        counter.value = i--
        signs.value = "-"
    }

}