package com.example.ejercicioviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var contador by mutableIntStateOf(0)
        private set

    fun incrementar() {
        contador++
    }
}