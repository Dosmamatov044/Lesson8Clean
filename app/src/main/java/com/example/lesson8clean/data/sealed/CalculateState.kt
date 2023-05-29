package com.example.lesson8clean.data.sealed

sealed class CalculateState<T> {


    data class Running<T>(val data: T) : CalculateState<T>()
    data class Finishing<T>(val message: String) : CalculateState<T>()
    class Loading<T> : CalculateState<T>()
    data class Failed<T>(val message: String) : CalculateState<T>()


    companion object {
        fun <T> running(data: T) = Running<T>(data)
        fun <T> finishing(message: String) = Finishing<T>(message)
        fun <T> failed(message: String) = Failed<T>(message)
        fun <T> loading() = Loading<T>()
    }


}