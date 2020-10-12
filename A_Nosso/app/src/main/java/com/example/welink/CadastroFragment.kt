package com.example.welink

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.welink.databinding.FragmentCadastroBinding


class CadastroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding:FragmentCadastroBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_cadastro, container, false
        )

        binding.btCadastrar.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_cadastroFragment_to_pinicialFragment)
        )

        binding.btLogin.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_cadastroFragment_to_loginFragment)
        )



       return binding.root
    }




}
