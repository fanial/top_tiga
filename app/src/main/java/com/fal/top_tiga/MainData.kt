package com.fal.top_tiga

import java.io.Serializable

data class MainData (
    val nm_produk : String,
    val harga : String,
    val stok : Int,
    val desc : String,
    val img_produk : Int
    ) : Serializable {
}