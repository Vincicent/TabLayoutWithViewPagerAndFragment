package com.example.test.tablayoutwithfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.test.tablayoutwithfragment.Fragments.FirstFragment
import com.example.test.tablayoutwithfragment.Fragments.SecondFragment
import kotlinx.android.synthetic.main.activity_second_page.*
import kotlinx.android.synthetic.main.appbar_main.*


class SecondPage : AppCompatActivity(){

    var pagerAdapter : CustomPagerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        setSupportActionBar(toolbar_main)


        pagerAdapter = CustomPagerAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(FirstFragment(),"FIRST")
        pagerAdapter!!.addFragments(SecondFragment(),"SECOND")

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)

    }


}
