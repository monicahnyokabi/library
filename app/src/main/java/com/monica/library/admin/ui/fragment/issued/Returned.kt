package com.monica.library.admin.ui.fragment.issued

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.monica.library.admin.data.Orders
import androidx.recyclerview.widget.LinearLayoutManager
import com.monica.library.R
import com.monica.library.admin.ui.adapter.ReturnedAdapter
import kotlinx.android.synthetic.main.fragment_returned.*


class Returned : Fragment(R.layout.fragment_returned) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycer_returned_admin.apply {
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()
            adapter = ReturnedAdapter(
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