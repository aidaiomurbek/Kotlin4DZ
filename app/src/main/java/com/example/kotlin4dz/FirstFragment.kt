package com.example.kotlin4dz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class FirstFragment : Fragment() {

     private lateinit var btnPlus : Button
     private lateinit var btnMinus : Button
     private lateinit var mainViewModel: MainViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel= ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        btnPlus = view.findViewById(R.id.btn_plus)
        btnMinus = view.findViewById(R.id.btn_minus)

        btnPlus.setOnClickListener {
            mainViewModel.plus()
        }

        btnMinus.setOnClickListener {
            mainViewModel.minus()
        }
    }

}