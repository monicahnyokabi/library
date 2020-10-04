package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R

class MembershipAdapter : RecyclerView.Adapter<MembershipAdapter.MembershipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MembershipViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_admin_pay, parent, false)
    )

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MembershipViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class MembershipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}