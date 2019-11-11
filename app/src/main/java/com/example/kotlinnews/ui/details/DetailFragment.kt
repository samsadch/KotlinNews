package com.example.kotlinnews.ui.details

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.kotlinnews.R
import com.example.kotlinnews.databinding.DetailFragmentBinding


class DetailFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val application = requireNotNull(activity).application
        val binding = DetailFragmentBinding.inflate(inflater)
        binding.lifecycleOwner = this
        val child = DetailFragmentArgs.fromBundle(arguments!!).selectedChild
        val viewModelFactory = DetailViewModelFactory(child, application)

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(DetailViewModel::class.java)
        binding.viewModel = viewModel
        viewModel.displayChildData.observe(this, Observer {
            (activity as AppCompatActivity).supportActionBar?.title = it
        })
        return binding.root
    }
}
