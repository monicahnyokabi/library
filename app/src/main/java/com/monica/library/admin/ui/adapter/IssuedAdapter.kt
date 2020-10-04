package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R

class IssuedAdapter(

) : RecyclerView.Adapter<IssuedAdapter.IssuedViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = IssuedViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_admin_issued, parent, false)
    )

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: IssuedViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class IssuedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}