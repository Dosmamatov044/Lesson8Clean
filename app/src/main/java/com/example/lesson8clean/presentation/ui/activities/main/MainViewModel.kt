package com.example.lesson8clean.presentation.ui.activities.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson8clean.domain.useCase.CalculateUseCase

class MainViewModel(val calculateUseCase: CalculateUseCase): ViewModel() {
     val resultData=MutableLiveData<Double>()

    fun calculate(operation:String,operandFirst:Double,operandSecond:Double){
        val result=calculateUseCase.calculateResult(operation,operandFirst,operandSecond)
        resultData.value=result
    }

}