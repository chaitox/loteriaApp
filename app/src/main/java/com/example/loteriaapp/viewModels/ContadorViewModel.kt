package com.example.loteriaapp.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {

    private val _contador = mutableIntStateOf(1)
    val contador: State<Int> = _contador

    fun add(){
        _contador.intValue += 1
    }

}