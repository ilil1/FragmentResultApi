package com.project.fragmentresultapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.project.fragmentresultapi.databinding.FragmentRecieverBinding
import com.project.fragmentresultapi.databinding.FragmentSenderBinding

class SenderFragment : Fragment() {

    private lateinit var binding: FragmentSenderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentSenderBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.btnYes.setOnClickListener {
            val result = "Yes"
            val bundle = bundleOf("bundleKey" to result)
            setFragmentResult("requestKey", bundle)
        }
        binding.btnNo.setOnClickListener {
            val result = "No"
            val bundle = bundleOf("bundleKey" to result)
            setFragmentResult("requestKey", bundle)
        }
    }
}