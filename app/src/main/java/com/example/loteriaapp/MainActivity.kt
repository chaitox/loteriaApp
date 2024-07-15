package com.example.loteriaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.loteriaapp.ui.theme.LoteriaAppTheme
import com.example.loteriaapp.viewModels.ContadorViewModel
import com.example.loteriaapp.viewModels.LoteriaViewModel
import com.example.loteriaapp.views.Contador
import com.example.loteriaapp.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val viewModel: ContadorViewModel by viewModels()
        val viewModel: LoteriaViewModel by viewModels()

        // enableEdgeToEdge()
        setContent {
            LoteriaAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoteriaView(viewModel)
                    //Contador(viewModel)
                }
            }
        }
    }
}
