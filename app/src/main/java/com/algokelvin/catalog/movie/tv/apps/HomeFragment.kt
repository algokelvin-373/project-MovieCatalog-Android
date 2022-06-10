package com.algokelvin.catalog.movie.tv.apps

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.algokelvin.catalog.movie.tv.utils.BuildConfig
import com.algokelvin.catalog.movie.tv.utils.dummy.MovieDummy
import com.algokelvin.catalog.movie.tv.utils.recyclerview.setupAdapterData
import com.algokelvin.catalog.movie.tv.utils.viewmodel.AppsViewModel
import com.algokelvin.catalog.movie.tv.utils.viewmodel.MovieTVVMFactory
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_movie_tv_type_one.view.*
import kotlinx.android.synthetic.main.item_movie_tv_type_three.view.*
import kotlinx.android.synthetic.main.item_movie_tv_type_two.view.*

class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private val homeViewModel by lazy {
        ViewModelProvider(this,
            MovieTVVMFactory(
                BuildConfig.API_MOVIE_TV,
                "en"
            )).get(AppsViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movieNowPlaying()
        moviePopular()
        movieNowPlay()

    }

    private fun movieNowPlaying() {
        homeViewModel.getMovieNowPlaying().observe(this) {
            rv_movie_top_rated.setupAdapterData(
                R.layout.item_movie_tv_type_two,
                requireContext(),
                it.results!!
            ) {
                data {
                    Glide.with(requireContext())
                        .load(BuildConfig.URL_POSTER + item?.backdrop_path)
                        .into(viewAdapterData.image_item_movie_top_rated)
                }
                setLayoutManager(linearLayoutManagerHorizontal(), 0)
                setAdapter()
            }
        }
    }

    private fun moviePopular() {
        rv_movie_popular.setupAdapterData(
            R.layout.item_movie_tv_type_one,
            requireContext(),
            MovieDummy.typeOne()
        ) {
            data {
                Glide.with(requireContext()).load(item?.image).into(viewAdapterData.image_item_movie)
                viewAdapterData.title_item_movie.text = item?.title
                viewAdapterData.rating_item_movie.text = getString(R.string.rating, item?.rating.toString())
            }
            setLayoutManager(linearLayoutManagerHorizontal(), 0)
            setAdapter()
        }
    }

    private fun movieNowPlay() {
        rv_movie_now_playing.setupAdapterData(
            R.layout.item_movie_tv_type_three,
            requireContext(),
            MovieDummy.typeOne()
        ) {
            data {
                Glide.with(requireContext()).load(item?.image).into(viewAdapterData.image_item_movie_now_playing)
                viewAdapterData.title_item_movie_now_playing.text = item?.title
                viewAdapterData.rating_item_movie_now_playing.text = getString(R.string.rating, item?.rating.toString())
            }
            setLayoutManager(gridLayoutManager(), 2)
            setAdapter()
        }
    }

}
