package com.monica.library.admin.ui.fragment.transaction

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.monica.library.R
import com.monica.library.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_payment.*

class Payment : Fragment(R.layout.fragment_payment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        val adapter = ViewPagerAdapter(
            childFragmentManager
        )

        adapter.addFragment(Penalty(), "Paid Penalty")
        adapter.addFragment(Membership(), "Membership Payment")

        pages.adapter = adapter
        tab.setupWithViewPager(pages)
    }
}