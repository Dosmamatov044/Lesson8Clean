package com.example.lesson8clean.domain.repository

interface CalculateRepository {
    fun performOperation(operation:String,operandFirst:Double,operandSecond:Double):Double
}






