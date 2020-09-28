package com.monica.library.user.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.monica.library.R
import kotlinx.android.synthetic.main.activity_login_user.*

class LoginUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_NoActionBar)
        setContentView(R.layout.activity_login_user)

        btn_login_user.setOnClickListener {
            startActivity(Intent(this, UserDashboard::class.java))
        }
    }
}