package com.example.guessinggamecompose

import androidx.lifecycle.ViewModel

class ResultViewModel(finalResult: String) : ViewModel(){
    val result = finalResult
}