package com.fal.top_tiga.latihansatu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fal.top_tiga.R
import com.fal.top_tiga.databinding.ItemProdukBinding

class ProdukAdapter(var listProduk : ArrayList<DataProduk>) : RecyclerView.Adapter<ProdukAdapter.ProdukViewHolder>(){
    class ProdukViewHolder(val binding : ItemProdukBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(itemDataProduk: DataProduk){
            binding.produk = itemDataProduk
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdukViewHolder {
        var view = ItemProdukBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ProdukViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProdukViewHolder, position: Int) {
        holder.bind(listProduk[position])
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }

    fun setProduk(itemProduk: ArrayList<DataProduk> ){
        this.listProduk = itemProduk
    }
}