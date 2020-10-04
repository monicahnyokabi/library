package com.monica.library.admin.ui.fragment.subscription

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.monica.library.R
import com.monica.library.admin.data.Subscription
import com.monica.library.admin.ui.adapter.SubscriptionAdapter
import kotlinx.android.synthetic.main.fragment_subscription.*


class Subscription : Fragment(R.layout.fragment_subscription) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recycler_sub.apply {
            layoutManager =LinearLayoutManager(requireContext())
            hasFixedSize()
            adapter = SubscriptionAdapter(
                listOf(
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired"),
                  Subscription("1","kkk","10/10/2019","expired")
                )
            )
        }
    }
}