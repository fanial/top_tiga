package com.fal.top_tiga

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {
    val produk = arrayListOf(
        MainData("Keyboard", "$10", 4, "keyboard canggih bisa ngetik sendiri", R.drawable.ic_launcher_foreground),
        MainData("Mouse", "$23",3,"mouse realistic seperti tikus", R.drawable.ic_launcher_foreground),
        MainData("Remote", "$25",5,"remote untuk mengendalikan hujan",R.drawable.ic_launcher_foreground),
        MainData("Kabel Type C", "$5",5,"Kabel untuk mentransfer ilmu hitam",R.drawable.ic_launcher_foreground),
        MainData("Botol 2L", "$90",5,"mengilangkan rasa haus, dan terlihat seperti orang zero waste",R.drawable.ic_launcher_foreground),
        MainData("Tissue", "$1",5,"Tissue yang udah pasti bisa menemani kamu nonton drama",R.drawable.ic_launcher_foreground),
        MainData("Kacamata", "$100",5,"Kacamata yg bisa bikin kamu keren seperti syahrini",R.drawable.ic_launcher_foreground),
    )

    val mList : MutableLiveData<List<MainData>> = MutableLiveData()

    fun getProduk(){
        val prod = produk
        mList.value = prod
    }
}