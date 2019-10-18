package com.exam.elevenstreet.data.model

import android.graphics.Bitmap

data class ProductItem @JvmOverloads constructor(
    var productName: String = "",
    var productImage: Bitmap? = null
)