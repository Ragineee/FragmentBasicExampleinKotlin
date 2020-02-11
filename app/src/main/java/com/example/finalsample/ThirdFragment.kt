package com.example.finalsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  layoutInflater.inflate(R.layout.thirdfragmentlayout,container,false)//super.onCreateView(inflater, container, savedInstanceState)
    }
}
