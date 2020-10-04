package com.monica.library.admin.ui.fragment.transaction

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.monica.library.R
import com.monica.library.admin.data.Transaction
import com.monica.library.admin.ui.adapter.PenaltyAdapter
import kotlinx.android.synthetic.main.fragment_penalty.*


class Penalty : Fragment(R.layout.fragment_penalty) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_penalty.apply{
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()
            adapter = PenaltyAdapter(
                listOf(
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100"),
                    Transaction("12/20/2019","Hahaha","Monica","100")
                )
            )
        }
    }

}