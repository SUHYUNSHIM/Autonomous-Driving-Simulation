package com.example.user.mobilesw

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


    class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> {
                    FirstFragment()
                }
                1 -> SecondFragment()
                else -> {
                    return ThirdFragment()
                }
            }
        }

        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence {
            return when (position) {
                0 -> "Stage 내용"
                1 -> "Sensor 설명"
                else -> {
                    return "Sensor 장착 방법"
                }
            }
        }
    }
