package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        val breedText : EditText = findViewById(R.id.editTextBreed)
        val yearText : EditText = findViewById(R.id.editTextYear)
        val monthText : EditText = findViewById(R.id.editTextMonth)

        var breed : String = ""
        var year : Int = 0
        var month : Int = 0

        if (breedText.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast1, Toast.LENGTH_SHORT)
            toast.show()
            breedText.requestFocus()
        }
        else if (yearText.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast2, Toast.LENGTH_SHORT)
            toast.show()
            yearText.requestFocus()
        }
        else if (monthText.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast3, Toast.LENGTH_SHORT)
            toast.show()
            monthText.requestFocus()
        }
        else {
            breed = breedText.text.toString()
            year = yearText.text.toString().toInt()
            month = monthText.text.toString().toInt()

            val animal: Animal = Animal(breed, year, month)

            val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(animal.javaClass.simpleName, animal)
            startActivity(intent)
        }
    }
}

