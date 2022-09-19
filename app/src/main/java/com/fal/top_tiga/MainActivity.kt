package com.fal.top_tiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.fal.top_tiga.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMain2Binding
    lateinit var adapter: MainAdapter
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // ViewModel
        viewModel.getProduk()
        viewModel.mList.observe(this, Observer {
            adapter.setProduk(it as ArrayList<MainData>)
        })
        //RecyclerView
        adapter = MainAdapter(ArrayList())
        binding.rvMain.adapter = adapter
        binding.rvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

    }
}