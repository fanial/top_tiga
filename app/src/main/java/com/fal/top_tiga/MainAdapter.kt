package com.fal.top_tiga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.fal.top_tiga.databinding.ItemListBinding

class MainAdapter(var listProduk : ArrayList<MainData>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder(val binding : ItemListBinding) : RecyclerView.ViewHolder(binding.root){
        fun data(itemData: MainData){
            binding.itemProduk = itemData
            binding.btnCard.setOnClickListener {
                var bundle = Bundle()
                bundle.putSerializable("dataProduk", itemData)
                Navigation.findNavController(itemView).navigate(R.id.action_mainFragment_to_detailFragment, bundle)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.data(listProduk[position])
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }

    fun setProduk(itemProduk: ArrayList<MainData> ){
        this.listProduk = itemProduk
    }
}