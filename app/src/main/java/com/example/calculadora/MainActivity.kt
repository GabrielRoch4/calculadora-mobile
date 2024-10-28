package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var displayText: TextView
    private var currentInput = ""
    private var operator = ""
    private var operand1: Double = 0.0
    private var operand2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayText = findViewById(R.id.displayText)

        // Configurando os botões de números
        listOf(
            R.id.button0, R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8, R.id.button9
        ).forEach { id ->
            findViewById<Button>(id).setOnClickListener {
                appendNumber((it as Button).text.toString())
            }
        }

        // Botões de operação
        findViewById<Button>(R.id.buttonAdd).setOnClickListener { setOperator("+") }
        findViewById<Button>(R.id.buttonSubtract).setOnClickListener { setOperator("-") }
        findViewById<Button>(R.id.buttonMultiply).setOnClickListener { setOperator("*") }
        findViewById<Button>(R.id.buttonDivide).setOnClickListener { setOperator("/") }
        findViewById<Button>(R.id.buttonDot).setOnClickListener { appendNumber(".") }

        // Botão igual
        findViewById<Button>(R.id.buttonEquals).setOnClickListener { calculateResult() }

        // Botão limpar
        findViewById<Button>(R.id.buttonClear).setOnClickListener { clearDisplay() }
    }

    private fun appendNumber(number: String) {
        currentInput += number
        displayText.text = currentInput
    }

    private fun setOperator(op: String) {
        if (currentInput.isNotEmpty()) {
            operand1 = currentInput.toDouble()
            operator = op
            currentInput = ""
        }
    }

    private fun calculateResult() {
        if (currentInput.isNotEmpty() && operator.isNotEmpty()) {
            operand2 = currentInput.toDouble()
            val result = when (operator) {
                "+" -> operand1 + operand2
                "-" -> operand1 - operand2
                "*" -> operand1 * operand2
                "/" -> if (operand2 != 0.0) operand1 / operand2 else "Erro"
                else -> "Erro"
            }
            displayText.text = result.toString()
            currentInput = result.toString()
            operator = ""
        }
    }

    private fun clearDisplay() {
        currentInput = ""
        operator = ""
        operand1 = 0.0
        operand2 = 0.0
        displayText.text = "0"
    }
}
