package com.monica.library.admin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R
import com.monica.library.admin.data.Books
import kotlinx.android.synthetic.main.item_books_admin.view.*

class BookAdapter(
    var books: List<Books>
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BookViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_books_admin, parent, false)
    )

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        var book = books[position]

        holder.itemView.admin_author_name.text = book.authorName
        holder.itemView.admin_book_name.text = book.bookName
        holder.itemView.admin_category.text = book.category
        holder.itemView.admin_desc.text = book.desc
        holder.itemView.admin_subcategory.text = book.subcategory
        holder.itemView.admin_year.text = book.year
        holder.itemView.admin_quantity.text = book.quantity
    }

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}