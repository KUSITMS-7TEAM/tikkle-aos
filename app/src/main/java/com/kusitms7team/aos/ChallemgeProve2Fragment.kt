package com.kusitms7team.aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentChallemgeProve1Binding
import com.kusitms7team.aos.databinding.FragmentChallemgeProve2Binding


class ChallemgeProve2Fragment : Fragment() {
    lateinit var binding: FragmentChallemgeProve2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_challemge_prove2, container, false)
        binding = DataBindingUtil.inflate(
            inflater,
            com.kusitms7team.aos.R.layout.fragment_challemge_prove2,
            container,
            false
        )

        val mActivity = activity as MainActivity
        val btn_next = rootView.findViewById<ImageButton>(R.id.btnNext)

        btn_next.setOnClickListener{
            //Toast.makeText(this@ChallemgeProve2Fragment, "챌린지 인증을 완료했습니다.", Toast.LENGTH_SHORT).show()
            (activity as MainActivity).changeProveFragment(3)
        }

        return rootView

    }
}