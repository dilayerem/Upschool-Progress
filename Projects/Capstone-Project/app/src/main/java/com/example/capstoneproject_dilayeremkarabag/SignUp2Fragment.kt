package com.example.capstoneproject_dilayeremkarabag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.capstoneproject_dilayeremkarabag.databinding.FragmentSignUp2Binding
import com.example.capstoneproject_dilayeremkarabag.databinding.FragmentSignUpBinding

class SignUp2Fragment : Fragment() {

    private lateinit var SignUpBinding: FragmentSignUp2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        SignUpBinding = DataBindingUtil.inflate(inflater,R.id.logInFragment,container,false)
        // Inflate the layout for this fragment
        return SignUpBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        SignUpBinding.haveAnAcc.setOnClickListener {
            findNavController().navigate(R.id.action_signUp2Fragment_to_logInFragment)
        }
    }

}