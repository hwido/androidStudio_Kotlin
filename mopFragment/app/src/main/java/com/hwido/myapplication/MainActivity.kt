package com.hwido.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.google.android.material.tabs.TabLayoutMediator
import com.hwido.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SecondFragment.Callbacks {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var firFragment = FirstFragment.newInstance("First","2022")
        var secFragment = SecondFragment.newInstance("Second","2022")

        val myFrags = listOf(firFragment,secFragment)
        val fragAdapter = FragmentAdapter(this)
        fragAdapter.fragList = myFrags
        binding.viewpager.adapter = fragAdapter

        val tabs = listOf("First","Second")
        TabLayoutMediator(binding.tabLayout,binding.viewpager){ tab, position ->
            tab.text = tabs.get(position)
        }.attach()


//        val fManager = supportFragmentManager
//        fManager.commit {
//            add(binding.fragFrame.id,firFragment)
//            setReorderingAllowed(true)
//            addToBackStack(null)
//        }
//
//        binding.button.setOnClickListener{
//            firFragment.setTitle("New Title for the first Fragment!")
////            fManager.commit {
////                replace(binding.fragFrame.id,secFragment)
////                setReorderingAllowed(true)
////                addToBackStack(null)
////            }
//        }

    }

    override fun onItemPrint(num: String) {
        binding.textView.text = num
    }
}