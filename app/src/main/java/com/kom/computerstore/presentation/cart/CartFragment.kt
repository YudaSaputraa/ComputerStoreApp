package com.kom.computerstore.presentation.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kom.computerstore.R
import com.kom.computerstore.databinding.FragmentCartBinding

class CartFragment : Fragment() {
 private lateinit var binding : FragmentCartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}