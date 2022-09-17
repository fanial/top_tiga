package com.fal.top_tiga.latihansatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fal.top_tiga.R
import com.fal.top_tiga.databinding.ActivityProdukBinding
import kotlinx.android.synthetic.main.activity_produk.*

class ProdukActivity : AppCompatActivity() {

    lateinit var  viewModel: ProdukViewModel
    lateinit var adapter: ProdukAdapter
    lateinit var binding: ActivityProdukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_produk)
        // set rv
        adapter = ProdukAdapter(ArrayList())
        binding.rvProduk.adapter = adapter
        binding.rvProduk.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // set livedata
        viewModel = ViewModelProvider(this).get(ProdukViewModel::class.java)
        viewModel.getProduk()
        viewModel.mList.observe(this, Observer {
            adapter.setProduk(it as ArrayList<DataProduk>)
        })
    }
}