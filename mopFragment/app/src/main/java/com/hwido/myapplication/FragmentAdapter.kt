package com.hwido.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    var fragList = listOf<Fragment>()
    override fun getItemCount(): Int {
        return fragList.size
    }
    override fun createFragment(position: Int): Fragment {
        return fragList.get(position)
    }
}