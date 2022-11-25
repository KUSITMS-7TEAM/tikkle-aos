package com.kusitms7team.aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentChallengeConsumptionBinding
import com.kusitms7team.aos.databinding.FragmentChallengePageBinding
import java.util.*

class ChallengeConsumptionFragment : Fragment() {

    lateinit var binding: FragmentChallengeConsumptionBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            com.kusitms7team.aos.R.layout.fragment_challenge_consumption,
            container,
            false
        )

        mainActivity = context as MainActivity

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with (binding) {
            //버튼을 누르면 SecondFragment로 이동
            binding.btnNext3.setOnClickListener {
                mainActivity.changeChallengeFragment(2)
            }
        }
    }
}