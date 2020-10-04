package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R

class PenaltyAdapter(

) : RecyclerView.Adapter<PenaltyAdapter.PenaltyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PenaltyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_admin_pay, parent, false)
    )

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PenaltyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class PenaltyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}