package com.example.lesson8clean

class Woolf :Animals() {
    lateinit var text:String



    operator fun invoke(text:String){

        this.text=text

    }

    operator fun invoke(text:Int){



    }

}