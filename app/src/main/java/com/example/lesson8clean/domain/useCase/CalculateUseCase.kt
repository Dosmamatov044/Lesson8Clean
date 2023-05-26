package com.example.lesson8clean.domain.useCase

import com.example.lesson8clean.domain.repository.CalculateRepository

class CalculateUseCase(private val calculateRepository: CalculateRepository) {

    fun calculateResult(operation:String,operandFirst:Double,operandSecond:Double):Double{
        return  calculateRepository.performOperation(operation,operandFirst,operandSecond)
    }

}