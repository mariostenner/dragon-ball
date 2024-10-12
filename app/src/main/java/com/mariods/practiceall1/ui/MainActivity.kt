package com.mariods.practiceall1.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.mariods.practiceall1.ui.theme.PracticeAll1Theme
import com.mariods.practiceall1.ui.view.home.HomeScreen
import com.mariods.practiceall1.ui.view.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity() : ComponentActivity() {
    private val dragonViewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeAll1Theme {
                Scaffold(
                    containerColor = Color(0xFFFA5225),
                    content = { paddingValues ->
                        Modifier.padding(paddingValues)
                        HomeScreen(dragonViewModel)
                    }
                )
            }
        }
    }
}
