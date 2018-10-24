package com.example.test.tablayoutwithfragment

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class CustomPagerAdapter (fm:FragmentManager) : FragmentPagerAdapter(fm) {

    var FM = fm
    var mFragmentTitle:ArrayList<String> = ArrayList()
    var mFragmentItems:ArrayList<Fragment> = ArrayList()

    override fun getItem(p0: Int): Fragment {

    return mFragmentItems[p0]

    }

    override fun getCount(): Int {

    return mFragmentItems.size

    }

    override fun getPageTitle(position: Int): CharSequence? {

        return mFragmentTitle[position]

    }

    fun addFragments (fragmentItems:Fragment,fragmentTitles:String){

        mFragmentItems.add(fragmentItems)
        mFragmentTitle.add(fragmentTitles)

    }


}