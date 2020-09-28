package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R
import com.monica.library.admin.data.Users
import kotlinx.android.synthetic.main.item_users.view.*

class UserAdapter(
    var users: List<Users>
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UserViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_users, parent, false)
    )

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var user = users[position]

        holder.itemView.users_name.text = user.name
        holder.itemView.users_contact.text = user.contact
        holder.itemView.users_email.text = user.email
        holder.itemView.users_amount.text = user.amount
        holder.itemView.users_address.text = user.address
        holder.itemView.users_register_date.text = user.registerDate
        holder.itemView.users_valid_till.text = user.validTill
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}