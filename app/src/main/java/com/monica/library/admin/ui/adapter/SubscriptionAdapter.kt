package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R
import com.monica.library.admin.data.Subscription
import kotlinx.android.synthetic.main.item_subscription.view.*

class SubscriptionAdapter(
    var subscriptions: List<Subscription>
) : RecyclerView.Adapter<SubscriptionAdapter.SubscriptionViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SubscriptionViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_subscription, parent, false)
    )

    override fun getItemCount() = subscriptions.size

    override fun onBindViewHolder(holder: SubscriptionViewHolder, position: Int) {
        var sub = subscriptions[position]

        holder.itemView.apply {
            ids.text = sub.id
            name.text = sub.name
            subtill.text = sub.till
            status.text = sub.status
        }

    }

    class SubscriptionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}