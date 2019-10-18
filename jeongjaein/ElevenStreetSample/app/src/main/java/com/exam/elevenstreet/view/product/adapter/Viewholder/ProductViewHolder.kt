package com.exam.elevenstreet.view.product.adapter.Viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.exam.elevenstreet.R
import com.exam.elevenstreet.module.GlideApp
import com.example.elevenstreet.ProductResponse
import kotlinx.android.synthetic.main.item_product.view.*

class ProductViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
) {
    private val textName: TextView = itemView.product_name_tv
    private val textPrice: TextView = itemView.product_price_tv
    private val textCode: TextView = itemView.product_code_tv
    private val textImage: ImageView = itemView.product_image_iv

    fun bind(productResponse: ProductResponse) {
//        val listener = View.OnClickListener { clickListener?.onClick() }



        itemView.run {

            val tempurl = productResponse.productImage.replace("\n".toRegex(), "")

            val replaceurl = tempurl.replace(" ".toRegex(), "")

            GlideApp.with(itemView)
                .load("http://i.011st.com/t/300/pd/18/2/4/2/2/4/8/eqSaS/2138242248_B.jpg")
                .error(R.drawable.ic_alarm_on_black_24dp)
                .into(textImage)

//            itemView.setOnClickListener(listener)
            textName.text = productResponse.productName
            textPrice.text = productResponse.productPrice
            textCode.text = replaceurl
//                var count = 0
//                val array : List<Int> = ArrayList<Int>()
//                for(i in 0..replaceurl.length){
//                    if(replaceurl[i] == productResponse.productImage[i]){
//                        count ++
//
//                    }
//                }
//            val compareurl = "http://i.011st.com/t/300/pd/18/2/4/2/2/4/8/eqSaS/2138242248_B.jpg"
//            if (replaceurl.length == compareurl.length) {
//                textCode.text = "고영찬 바보@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
//            }
        }
    }
}