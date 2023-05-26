package com.example.lesson8clean.data.repository

import com.example.lesson8clean.domain.repository.CalculateRepository

class CalculateRepositoryImpl:CalculateRepository {
    override fun performOperation(
        operation: String,
        operandFirst: Double,
        operandSecond: Double
    ): Double {

        return  when(operation){
           "+"-> operandFirst+operandSecond
           "-"-> operandFirst-operandSecond
           "*"-> operandFirst*operandSecond
           "/"-> operandFirst/operandSecond


            else -> throw IllegalArgumentException("Invalid operation")
        }
    }
}