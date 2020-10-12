package com.example.welink

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.welink.databinding.FragmentPedidosBinding


class PedidosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentPedidosBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_pedidos, container, false
        )

        binding.btFinalizar.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_pedidosFragment_to_finalFragment)
        )

        return binding.root



    }
}