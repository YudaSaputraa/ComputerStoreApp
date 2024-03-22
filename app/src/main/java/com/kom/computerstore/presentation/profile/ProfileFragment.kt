package com.kom.computerstore.presentation.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kom.computerstore.R
import com.kom.computerstore.databinding.FragmentCartBinding
import com.kom.computerstore.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding : FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}