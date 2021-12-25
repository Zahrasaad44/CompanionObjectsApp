package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.companionobjectsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        switch()
    }


    private fun switch() {
        binding.switchBtn.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                Time.makeDay(binding.dayNightCL, binding.instructionTV)
            } else {
                Time.makeNight(binding.dayNightCL, binding.instructionTV)
            }
        }
    }


//    private fun applyChanges() {
//        val input = binding.userInputET.text.toString().lowercase()
//        when (input) {
//            "day" -> Time.makeDay(binding.dayNightCL, binding.instructionTV, binding.userInputET, binding.submitBtn)
//            "night" -> Time.makeNight(binding.dayNightCL, binding.instructionTV, binding.userInputET, binding.submitBtn)
//            else -> Toast.makeText(this, "Type 'day' or 'night' only", Toast.LENGTH_LONG).show()
//        }
//    }

}