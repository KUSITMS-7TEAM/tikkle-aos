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

            val mActivity = activity as MainActivity
            val btn_next = rootView.findViewById<ImageButton>(R.id.title2)

            btn_next.setOnClickListener {
                (activity as MainActivity).changeFeedFragment(2)
            }

            return rootView

    }
}