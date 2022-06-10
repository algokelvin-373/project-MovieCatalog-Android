package com.algokelvin.catalog.movie.tv.apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.algokelvin.catalog.movie.tv.utils.ConstantVal
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConstantVal.Layout.tabLayoutMenu(supportFragmentManager, layoutViewPagerMovie,
            HomeFragment(), FavoriteFragment(), ProfileFragment())

        tabs_layout_main.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) { }
            override fun onTabUnselected(p0: TabLayout.Tab?) { }
            override fun onTabSelected(p0: TabLayout.Tab?) {
                p0?.position?.let { position ->
                    layoutViewPagerMovie.setCurrentItem(position, true)
                }
            }
        })
    }
}
