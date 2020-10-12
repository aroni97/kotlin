package com.example.welink

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.welink.databinding.FragmentPinicialBinding



class PinicialFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentPinicialBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_pinicial, container, false)

        binding.btProdutos.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_pinicialFragment_to_frutasFragment)
        )

        setHasOptionsMenu(true)

        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
                requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}