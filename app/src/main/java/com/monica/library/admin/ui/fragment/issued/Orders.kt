package com.monica.library.admin.ui.fragment.issued

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.monica.library.R
import com.monica.library.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_orders.*

class Orders : Fragment(R.layout.fragment_orders) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setup()
    }

    private fun setup() {
        val adapter = ViewPagerAdapter(
            childFragmentManager
        )

        adapter.addFragment(Issued(), "Issued Books")
        adapter.addFragment(Returned(), "Returned Books")

        pager.adapter = adapter
        tabs.setupWithViewPager(pager)
    }
}