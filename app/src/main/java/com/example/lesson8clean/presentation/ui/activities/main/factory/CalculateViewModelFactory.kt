package com.example.lesson8clean.presentation.ui.activities.main.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lesson8clean.domain.useCase.CalculateUseCase
import com.example.lesson8clean.presentation.ui.activities.main.MainViewModel

class CalculateViewModelFactory(val calculateUseCase: CalculateUseCase):ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(MainViewModel::class.java)){

          return MainViewModel(calculateUseCase =calculateUseCase ) as T

        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")

    }




}