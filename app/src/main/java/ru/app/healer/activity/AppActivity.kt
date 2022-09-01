package ru.app.healer.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import ru.app.healer.R
import ru.app.healer.databinding.ActivityMainBinding

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.home,
            R.id.calendar,
            R.id.profile
        ))
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.bottomNavigation.setupWithNavController(navController)

        //TODO("отладить переключение фрагментов по кликам в меню навигации (пример: https://www.youtube.com/watch?v=wzu380RouwI)")

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    //
                    true
                }
                R.id.calendar -> {
                    //
                    true
                }
                R.id.profile -> {
                    //
                    true
                }
                else -> false
            }
        }

        binding.bottomNavigation.setOnItemReselectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    //
                    true
                }
                else -> false
            }
        }
    }
}



