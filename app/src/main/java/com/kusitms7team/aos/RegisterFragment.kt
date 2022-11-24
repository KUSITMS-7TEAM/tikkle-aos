package com.kusitms7team.aos

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.kusitms7team.aos.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding : FragmentRegisterBinding
    private lateinit var kakaoAuthViewModel: KakaoAuthViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register,container,false)
        kakaoAuthViewModel = ViewModelProvider(this).get(KakaoAuthViewModel::class.java)
        val dao = UserDatabase.getInstance(requireContext()).userDAO
        val repository= UserRepository(dao)
        val factory = UserViewModelFactory(repository)
        val userViewModel = ViewModelProvider(this,factory).get(UserViewModel::class.java)
        binding.kakaoRegisterViewModel = kakaoAuthViewModel
        binding.startKakaoBtn.setOnClickListener{
            kakaoAuthViewModel.handleKakaoLogin()

        }

        kakaoAuthViewModel.accessToken.observe(viewLifecycleOwner) {
            Log.d("MYTAG", "token is ${it}")
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)

        }
        kakaoAuthViewModel.userEmail.observe(viewLifecycleOwner){
            userViewModel.email = it!!
            userViewModel.insertUser()

        }
        return binding.root

    }
}