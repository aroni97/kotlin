package com.example.welink

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.welink.databinding.FragmentFrutasBinding



class FrutasFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentFrutasBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_frutas, container, false
        )
        return binding.root


    }

}