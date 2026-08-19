package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Connects to XML layout

        // UI elements
        fun main() {

            println("enter the first number:")
            val num1 = readLine()!!.toDouble()

            println("Enter operator (+,-,*,/):")
            val operator = readLine()!!

            println("Enter the second number:")
            val num2 = readLine()!!.toDouble()

            val result = when (operator) {

                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> {
                    if (num2 != 0.0) {
                        num1 / num2
                    } else {
                        "cannot divide by zero"
                    }
                }

                else -> "invalid operator"

            }
            println("Result: $result")
        }
    }