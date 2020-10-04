package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R
import com.monica.library.admin.data.Transaction
import kotlinx.android.synthetic.main.item_admin_pay.view.*

class PenaltyAdapter(
    var transactions: List<Transaction>
) : RecyclerView.Adapter<PenaltyAdapter.PenaltyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PenaltyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_admin_pay, parent, false)
    )

    override fun getItemCount() = transactions.size

    override fun onBindViewHolder(holder: PenaltyViewHolder, position: Int) {
        var transaction = transactions[position]

        holder.itemView.apply {
            date.text = transaction.date
            forwhat.text = transaction.forwhat
            user.text = transaction.user
            amount.text = transaction.amount
        }
    }

    class PenaltyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}