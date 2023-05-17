package com.example.part2_chapter11

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.part2_chapter11.databinding.FragmentHomeBinding


class HomeFragment: Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    @SuppressLint("StringFormatInvalid")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentHomeBinding.bind(view)

        val homeData = context?.readData() ?: return

        binding.appBarTitleTextView.text = getString(R.string.appbar_title_text, homeData.user.nickname)

        binding.starCountTextView.text = getString(R.string.appbar_title_text, homeData.user.starCount, homeData.user.totalCount)


        binding.appBarProgressBar.progress = homeData.user.starCount
        binding.appBarProgressBar.max = homeData.user.totalCount

        Glide.with(binding.appbarImageView)
            .load(homeData.appbarImage)
            .into(binding.appbarImageView)
    }
}