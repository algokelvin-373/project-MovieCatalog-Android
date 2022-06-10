package com.algokelvin.catalog.movie.tv.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.algokelvin.catalog.movie.tv.utils.layout.AlgoKelvinViewPager
import com.algokelvin.catalog.movie.tv.utils.layout.AppsViewPageAdapter

object ConstantVal {
    object Layout {
        fun tabLayoutMenu(
            supportFragmentManager: FragmentManager,
            layoutViewPagerMovie: AlgoKelvinViewPager,
            vararg fragment: Fragment
        ) {
            val appsViewPageAdapter = AppsViewPageAdapter(supportFragmentManager)
            appsViewPageAdapter.addAppsPage(fragment)
            layoutViewPagerMovie.adapter = appsViewPageAdapter
        }
    }
}