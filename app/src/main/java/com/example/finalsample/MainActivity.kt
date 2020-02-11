package com.example.finalsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment.setOnClickListener {
            loadFragment(FirstFragment())

        }

        secondFragment.setOnClickListener {
            loadFragment(SecondFragment())
        }

        thirdFragment.setOnClickListener {
            loadFragment(ThirdFragment())
        }

    }

    fun loadFragment(fragment: Fragment) {

        // create a fragment manager
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction?.replace(R.id.frameLayout, fragment)
        fragmentTransaction?.commit()
    }
}
