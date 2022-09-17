package com.fal.top_tiga.latihansatu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fal.top_tiga.R

class ProdukViewModel : ViewModel() {
    val produk = arrayListOf(
        DataProduk("Keyboard", "$10", 4, "keyboard canggih bisa ngetik sendiri", R.drawable.ic_launcher_foreground),
        DataProduk("Mouse", "$23",3,"mouse realistic seperti tikus", R.drawable.ic_launcher_foreground)
    )

    val mList : MutableLiveData<List<DataProduk>> = MutableLiveData()

    fun getProduk(){
        val prod = produk
        mList.value = prod
    }

}