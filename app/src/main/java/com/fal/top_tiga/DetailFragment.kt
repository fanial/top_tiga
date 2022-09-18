package com.fal.top_tiga

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fal.top_tiga.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getProduk = arguments?.getSerializable("dataProduk") as MainData

        binding.detailImage.setImageResource(getProduk.img_produk)
        binding.dNmProduk.text = getProduk.nm_produk
        binding.dHargaProduk.text = getProduk.harga
        binding.dStok.text = getProduk.stok.toString()
        binding.dDeskripsi.text = getProduk.desc
        binding.btnBuy.setOnClickListener {
            val number = +6285795434518
            val send = Intent(Intent.ACTION_VIEW)
            send.data = Uri.parse(String.format("https://api.whatsapp.com/send?phone=$number&text="+"Hai! Saya tertarik dengan produk [${getProduk.nm_produk}] dengan harga ${getProduk.harga}, Apakah masih tersedia?"))
            startActivity(send)
        }

    }



}