package com.monica.library.admin.ui.fragment.issued

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.monica.library.R
import com.monica.library.admin.data.Orders
import com.monica.library.admin.ui.adapter.IssuedAdapter
import kotlinx.android.synthetic.main.fragment_issued.*


class Issued : Fragment(R.layout.fragment_issued) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycer_issued_admin.apply {
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()
            adapter = IssuedAdapter(
                listOf(
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica "),
                    Orders("21","Monica ")
                )
            )
        }
    }
}