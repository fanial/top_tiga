package com.fal.top_tiga

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.fal.top_tiga.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        val getProduk = intent.getSerializableExtra("dataProduk") as MainData
        binding.detailImage.setImageResource(getProduk.img_produk)
        binding.dNmProduk.text = getProduk.nm_produk
        binding.dHargaProduk.text = getProduk.harga
        binding.dStok.text = getProduk.stok.toString()
        binding.dDeskripsi.text = getProduk.desc
        binding.btnBuy.setOnClickListener {
            val number = +6285795434518
            val send = Intent(Intent.ACTION_VIEW)
            send.data =
                Uri.parse(String.format("https://api.whatsapp.com/send?phone=$number&text=" + "Hai! Saya tertarik dengan produk [${getProduk.nm_produk}] dengan harga ${getProduk.harga}, Apakah masih tersedia?"))
            startActivity(send)

        }
    }
}