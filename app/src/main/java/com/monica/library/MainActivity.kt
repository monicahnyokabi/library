package com.monica.library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.monica.library.R
import com.monica.library.admin.ui.activity.Login
import com.monica.library.user.ui.activity.LoginUser
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_NoActionBar)
        setContentView(R.layout.activity_main)

        login_admin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        login_user.setOnClickListener {
            startActivity(Intent(this, LoginUser::class.java))
        }
    }
}