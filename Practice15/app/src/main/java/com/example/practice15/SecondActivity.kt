package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewInfo : TextView = findViewById(R.id.textViewBreed)

        var animal : Animal = Animal()
        val arguments : Bundle? = intent.extras

        if(arguments != null){
            animal = arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal

            textViewInfo.text = "Месяц рождения: ${animal.getMonth()}\nГод рождения: ${animal.getYear()}\nПорода: ${animal.getBreed()}"
        }

    }
}