package com.project.fragmentresultapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.project.fragmentresultapi.databinding.FragmentRecieverBinding

// TODO: Rename parameter arguments, choose names that match

class RecieverFragment : Fragment() {

    private lateinit var binding: FragmentRecieverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentRecieverBinding.inflate(layoutInflater)

        setFragmentResultListener("requestKey") { requestKey, bundle ->
            bundle.getString("bundleKey")?.let {
                binding.textView.setText(it)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
}