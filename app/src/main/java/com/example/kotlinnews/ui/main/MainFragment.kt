package com.example.kotlinnews.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.kotlinnews.R
import com.example.kotlinnews.SpacesItemDecoration
import com.example.kotlinnews.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = MainFragmentBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        binding.photosGrid.adapter = PhotoGridAdapter(PhotoGridAdapter.OnClickListener {
            viewModel.displayPropertyDetails(it)
        })
        val spacingInPixels = resources.getDimensionPixelSize(R.dimen.spacing)
        binding.photosGrid.addItemDecoration(SpacesItemDecoration(spacingInPixels))

        viewModel.responses.observe(this, Observer {
            /*if(null!=it){
                (activity as AppCompatActivity).supportActionBar?.title = it.get(0).data.title
            }else{
                (activity as AppCompatActivity).supportActionBar?.title = "list is empty"
            }*/
        })

        viewModel.navigateToSelectedProperty.observe(this, Observer {

            if ( null != it ) {
                this.findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailFragment(it))
                viewModel.displayPropertyDetailsComplete()
            }
        })

        (activity as AppCompatActivity).supportActionBar?.title = "Kotlin News"
        return binding.root
    }

}
