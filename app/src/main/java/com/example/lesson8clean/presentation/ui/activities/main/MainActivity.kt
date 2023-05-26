package com.example.lesson8clean.presentation.ui.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.lesson8clean.R
import com.example.lesson8clean.data.repository.CalculateRepositoryImpl
import com.example.lesson8clean.databinding.ActivityMainBinding
import com.example.lesson8clean.domain.repository.CalculateRepository
import com.example.lesson8clean.domain.useCase.CalculateUseCase
import com.example.lesson8clean.presentation.ui.activities.main.factory.CalculateViewModelFactory
import com.example.lesson8clean.presentation.ui.helpers.showToast

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val repository=CalculateRepositoryImpl()
    val useCase=CalculateUseCase(repository)
    val viewModel:MainViewModel by viewModels { CalculateViewModelFactory(useCase) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.multiplyBtn.setOnClickListener {
            val first=binding.firstText.text.toString().toDouble()
            val second=binding.secondtText.text.toString().toDouble()


            viewModel.calculate(binding.multiplyBtn.text.toString(),first,second)

        }

        binding.plusBtn.setOnClickListener {
            val first=binding.firstText.text.toString().toDouble()
            val second=binding.secondtText.text.toString().toDouble()


            viewModel.calculate(binding.plusBtn.text.toString(),first,second)

        }



        viewModel.resultData.observe(this){
            binding.resultText.text=it.toString()

        }








    }
}