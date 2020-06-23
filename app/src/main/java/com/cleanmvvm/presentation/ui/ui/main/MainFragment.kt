package com.cleanmvvm.presentation.ui.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cleanmvvm.R
import com.cleanmvvm.databinding.MainFragmentBinding
import com.cleanmvvm.di.injectFeature
import org.koin.androidx.viewmodel.ext.viewModel

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModel()

    private lateinit var binding: MainFragmentBinding

    private val adapter by lazy { GitHubRepositoryAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater)
        binding.viewModel = viewModel
        binding.adapter = adapter
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectFeature()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.data.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })
    }

}
