package com.example.calculatrice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener() {
            var a:Double = number1.text.toString().toDouble()
            var b:Double = number2.text.toString().toDouble()
            var result:Double = a + b
            textView.text = result.toString()
        }

        substract.setOnClickListener() {
            var a:Double = number1.text.toString().toDouble()
            var b:Double = number2.text.toString().toDouble()
            var result:Double = a - b
            textView.text = result.toString()
        }

        divide.setOnClickListener() {
            var a:Double = number1.text.toString().toDouble()
            var b:Double = number2.text.toString().toDouble()
            var result:Double = a / b
            textView.text = result.toString()
        }

        multiply.setOnClickListener() {
            var a:Double = number1.text.toString().toDouble()
            var b:Double = number2.text.toString().toDouble()
            var result:Double = a * b
            textView.text = result.toString()
        }
    }
}