package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R
import com.monica.library.admin.data.Transaction
import kotlinx.android.synthetic.main.item_admin_pay.view.*

class MembershipAdapter(
    var transactions: List<Transaction>
) : RecyclerView.Adapter<MembershipAdapter.MembershipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MembershipViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_admin_pay, parent, false)
    )

    override fun getItemCount() = transactions.size

    override fun onBindViewHolder(holder: MembershipViewHolder, position: Int) {
        var transaction = transactions[position]

        holder.itemView.apply {
            date.text = transaction.date
            forwhat.text = transaction.forwhat
            user.text = transaction.user
            amount.text = transaction.amount
        }
    }

    class MembershipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}