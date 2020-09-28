package com.monica.library.admin.ui.fragment.user

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.monica.library.R
import com.monica.library.admin.data.Users
import com.monica.library.admin.ui.adapter.UserAdapter
import kotlinx.android.synthetic.main.fragment_users.*


class Users : Fragment(R.layout.fragment_users) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_users.apply {
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()
            adapter = UserAdapter(
                listOf(
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    ),
                    Users(
                        "Monica",
                        "07435526622",
                        "monica@gmail.com",
                        "100",
                        "Monrovia",
                        "12/09/2020",
                        "12/09/2020"
                    )
                )
            )
        }

        add_user.setOnClickListener {
            Navigation.findNavController(it).navigate(UsersDirections.actionAddUser())
        }
    }
}