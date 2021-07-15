package com.example.kotlin4dz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

class ThirdFragment : Fragment() {
    private lateinit var adapter: CounterAdapter
    private lateinit var mainViewModel: MainViewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = CounterAdapter()
        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        recyclerView = view.findViewById(R.id.recycler_View3)
        mainViewModel.signs.observe(viewLifecycleOwner, Observer {
            adapter.addItem(it)

        })
        recyclerView.adapter= adapter


    }
}