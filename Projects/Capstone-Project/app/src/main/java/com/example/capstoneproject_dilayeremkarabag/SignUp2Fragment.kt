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

    private lateinit var signUp2Binding: FragmentSignUp2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        signUp2Binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up2,container,false)
        return signUp2Binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signUp2Binding.haveAnAcc.setOnClickListener {
            findNavController().navigate(R.id.action_signUp2Fragment_to_logInFragment)
        }
        signUp2Binding.backbutton2.setOnClickListener {
            findNavController().navigate(R.id.action_signUp2Fragment_to_firstPageFragment2)
        }
    }

}