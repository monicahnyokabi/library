package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R
import com.monica.library.admin.data.Orders
import kotlinx.android.synthetic.main.item_admin_issued.view.*

class ReturnedAdapter(
    var orders: List<Orders>
) : RecyclerView.Adapter<ReturnedAdapter.ReturnedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ReturnedViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_admin_issued, parent, false)
    )

    override fun getItemCount() = orders.size


    override fun onBindViewHolder(holder: ReturnedViewHolder, position: Int) {
        var order = orders[position]

        holder.itemView.apply {
            copies.text = order.copies
            borrower.text = order.borrower
        }
    }

    class ReturnedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}