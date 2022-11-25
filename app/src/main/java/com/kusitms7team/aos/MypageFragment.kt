package com.kusitms7team.aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentChallengeConsumptionBinding
import com.kusitms7team.aos.databinding.FragmentMypageBinding


class MypageFragment : Fragment() {

    lateinit var binding: FragmentMypageBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_mypage, container, false)
        binding = DataBindingUtil.inflate(
            inflater,
            com.kusitms7team.aos.R.layout.fragment_mypage,
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
            binding.imageButton.setOnClickListener {
                mainActivity.changeMypageFragment(2)
            }
        }
    }
}