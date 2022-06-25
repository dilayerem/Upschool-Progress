package com.example.capstoneproject_dilayeremkarabag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.capstoneproject_dilayeremkarabag.databinding.FragmentLogInBinding

class LogInFragment : Fragment() {

    private lateinit var loginBinding: FragmentLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_log_in,container,false)
        return loginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginBinding.frgtpass.setOnClickListener {
            findNavController().navigate(R.id.action_logInFragment_to_forgotPasswordFragment)
        }
        loginBinding.backbutton2.setOnClickListener {
            findNavController().navigate(R.id.action_logInFragment_to_signUp2Fragment)
        }
    }
}