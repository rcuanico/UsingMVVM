package com.rcuanico.usingmvvm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class TryViewModel : ViewModel() {

    var bgColor by mutableStateOf(Color.White)
        private set

    fun changeBgColor() {
        bgColor = Color.Blue
    }
}