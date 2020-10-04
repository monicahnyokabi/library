package com.monica.library.admin.ui.fragment.book

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.monica.library.R
import com.monica.library.admin.data.Books
import com.monica.library.admin.data.Test
import com.monica.library.admin.ui.adapter.BookAdapter
import com.monica.library.admin.ui.adapter.TestAdapter
import kotlinx.android.synthetic.main.fragment_books.*


class Books : Fragment(R.layout.fragment_books) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_books_admin.apply {
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()

            adapter = TestAdapter(
                listOf(
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot"),
                    Test("James","He is very Hot")
                )
            )
//            adapter = BookAdapter(
//                listOf(
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100"),
//                    Books("J", "k", "fkdjkdjkdkjfkdfk", "2019", "lit", "eng", "100")
//                )
//            )
        }

        add_books_admin.setOnClickListener {
            Navigation.findNavController(it).navigate(BooksDirections.actionAddBook())
        }
    }
}