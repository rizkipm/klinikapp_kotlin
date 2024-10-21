package com.rizki.appklinik_mi2b.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizki.appklinik_mi2b.R
import com.rizki.appklinik_mi2b.model.ModelIcon
import com.rizki.appklinik_mi2b.model.ModelListDoctors

class AdapterListDoctors(
    val itemListDoctors: List<ModelListDoctors>
) : RecyclerView.Adapter<AdapterListDoctors.MyViewHolder>(){
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgDoctor : ImageView = itemView.findViewById(R.id.imgItemDoctors)
        var txtNamaDoctor : TextView = itemView.findViewById(R.id.txtItemNamaDr)
        var txtBidang : TextView = itemView.findViewById(R.id.txtItemBidangDr)
        var txtJumlahReview : TextView = itemView.findViewById(R.id.txtItemJumlahReview)
        var txtJumlahRating : TextView = itemView.findViewById(R.id.txtItemJumlahRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doctor, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return  itemListDoctors.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemListDoctors[position]
        holder.imgDoctor.setImageResource(currentItem.imageDr)
        holder.txtNamaDoctor.setText(currentItem.namaDr)
        holder.txtBidang.setText(currentItem.bidangDr)
        holder.txtJumlahReview.setText(currentItem.totalReview)
        holder.txtJumlahRating.setText(currentItem.angkaReview)
    }

}