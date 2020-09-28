package com.monica.library.user.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.monica.library.BuildConfig
import com.monica.library.R
import kotlinx.android.synthetic.main.activity_user_dashboard.*

class UserDashboard : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_NoActionBar)
        setContentView(R.layout.activity_user_dashboard)

        setSupportActionBar(toolbars)


        version_text.text = "v${BuildConfig.VERSION_NAME}"

        setupNavigation()
    }

    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.fragment_user)
        // Update action bar to reflect navigation
        NavigationUI.setupActionBarWithNavController(this, navController, drawer_layout_user)
        NavigationUI.setupWithNavController(nav_views, navController)
        navController.addOnDestinationChangedListener { _, destination, _ -> }
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout_user)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onSupportNavigateUp() =
        NavigationUI.navigateUp(findNavController(R.id.fragment_user), drawer_layout_user)
}