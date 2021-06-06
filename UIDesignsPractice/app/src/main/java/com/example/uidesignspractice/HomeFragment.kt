package com.example.uidesignspractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.uidesignspractice.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>()
        imageList.add(
            SlideModel(
                "https://bit.ly/2YoJ77H",
                "The animal population decreased by 58 percent in 42 years."
            )
        )
        imageList.add(
            SlideModel(
                "https://bit.ly/2BteuF2",
                "Elephants and tigers may become extinct."
            )
        )
        imageList.add(SlideModel("https://bit.ly/3fLJf72", "And people do that."))


        val imageSlider = binding.imageSlider
        imageSlider.startSliding(3000)
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)

    }
}