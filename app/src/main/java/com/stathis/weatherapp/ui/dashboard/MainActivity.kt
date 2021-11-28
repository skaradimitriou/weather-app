package com.stathis.weatherapp.ui.dashboard

import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.stathis.weatherapp.R
import com.stathis.weatherapp.abstraction.AbstractActivity
import com.stathis.weatherapp.databinding.ActivityMainBinding

class MainActivity : AbstractActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun init() {
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavigationMenu.setupWithNavController(navController)
    }

    override fun startOps() {}

    override fun stopOps() {}
}