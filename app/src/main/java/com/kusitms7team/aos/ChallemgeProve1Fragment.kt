package com.kusitms7team.aos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentChallemgeProve1Binding
import java.util.*


class ChallemgeProve1Fragment : Fragment() {

    lateinit var binding: FragmentChallemgeProve1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_challemge_prove1, container, false)
        binding = DataBindingUtil.inflate(
            inflater,
            com.kusitms7team.aos.R.layout.fragment_challemge_prove1,
            container,
            false
        )

        val mActivity = activity as MainActivity
        val btn_next = rootView.findViewById<ImageButton>(R.id.btnMoneyNext)

        btn_next.setOnClickListener{
            (activity as MainActivity).changeProveFragment(2)
        }

        return rootView

    }
}