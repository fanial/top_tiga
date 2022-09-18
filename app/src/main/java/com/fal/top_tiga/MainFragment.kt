package com.fal.top_tiga

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.fal.top_tiga.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainBinding
    lateinit var adapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // ViewModel
        viewModel.getProduk()
        viewModel.mList.observe(viewLifecycleOwner, Observer {
            adapter.setProduk(it as ArrayList<MainData>)
        })
        //RecyclerView
        adapter = MainAdapter(ArrayList())
        binding.rvMain.adapter = adapter
        binding.rvMain.layoutManager = GridLayoutManager(context, 2)
    }

}