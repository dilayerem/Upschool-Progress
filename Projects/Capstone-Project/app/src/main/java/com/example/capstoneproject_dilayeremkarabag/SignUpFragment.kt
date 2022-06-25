package com.example.capstoneproject_dilayeremkarabag

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.capstoneproject_dilayeremkarabag.databinding.FragmentSignUpBinding
import com.example.capstoneproject_dilayeremkarabag.SignUpFragment as SignUpFragment


class SignUpFragment : Fragment() {

   /* private lateinit var SignUpBinding: FragmentSignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        SignUpBinding = DataBindingUtil.inflate(inflater,R.id.signUpFragment,container,false)
        //inflate(inflater, container, false)
        return SignUpBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        SignUpBinding.haveAnAcc.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_logInFragment)
        }
    }
    */
}