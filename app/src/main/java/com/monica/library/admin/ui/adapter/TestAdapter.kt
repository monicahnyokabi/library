package com.monica.library.admin.ui.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.monica.library.R
import com.monica.library.admin.data.Test
import kotlinx.android.synthetic.main.item_test.view.*


class TestAdapter(
    var tests: List<Test>
) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = TestViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)
    )

    override fun getItemCount() = tests.size

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        var test = tests[position]

        holder.itemView.apply {
            tvname.text = test.name
            tvdesc.text = test.desc
        }
    }

    inner class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}