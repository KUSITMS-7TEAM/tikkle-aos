package com.kusitms7team.aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentChallemgeProve1Binding
import com.kusitms7team.aos.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {

    lateinit var binding: FragmentFeedBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            val rootView = inflater.inflate(R.layout.fragment_feed, container, false)
            binding = DataBindingUtil.inflate(
                inflater,
                com.kusitms7team.aos.R.layout.fragment_feed,
                container,
                false
            )
        mainActivity = context as MainActivity

////            val mActivity = activity as MainActivity
//            val btn_next = rootView.findViewById<ImageButton>(R.id.title2)
//
//            binding.title2.setOnClickListener {
//                (context as MainActivity).changeFeedFragment(2)
//            }
//
//            return rootView
//
//        //commit용
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with (binding) {
            //버튼을 누르면 SecondFragment로 이동
            binding.title2.setOnClickListener {
                mainActivity.changeFeedFragment(2)
            }
        }
    }
}