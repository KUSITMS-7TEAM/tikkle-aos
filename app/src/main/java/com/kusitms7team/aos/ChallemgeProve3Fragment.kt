package com.kusitms7team.aos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentChallemgeProve2Binding
import com.kusitms7team.aos.databinding.FragmentChallemgeProve3Binding

class ChallemgeProve3Fragment : Fragment() {
    lateinit var binding: FragmentChallemgeProve3Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_challemge_prove3, container, false)
        binding = DataBindingUtil.inflate(
            inflater,
            com.kusitms7team.aos.R.layout.fragment_challemge_prove3,
            container,
            false
        )

        val mActivity = activity as MainActivity
        val btn_next = rootView.findViewById<ImageButton>(R.id.btnNext)

        btn_next.setOnClickListener{

            val intent = Intent(getActivity(), MainActivity::class.java)
            startActivity(intent)
        }

        return rootView

    }
}