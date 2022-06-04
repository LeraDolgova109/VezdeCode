package com.example.vezdecode

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var enteredPin: String = ""
    var truePin: String = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.get_pin_layout, null)

        with(builder) {
            setTitle("Установите пинкод")
            setCancelable(false)

            setPositiveButton("OK") { dialog, which ->
                truePin =
                    dialogLayout.findViewById<EditText>(R.id.et_editText).toString()
                setCancelable(true)
            }
            setView(dialogLayout)
            show()
        }

        circle_1.setOnClickListener() {
            enteredPin += "1"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_2.setOnClickListener() {
            enteredPin += "2"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_3.setOnClickListener() {
            enteredPin += "3"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_4.setOnClickListener() {
            enteredPin += "4"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_5.setOnClickListener() {
            enteredPin += "5"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_6.setOnClickListener() {
            enteredPin += "6"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_7.setOnClickListener() {
            enteredPin += "7"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_8.setOnClickListener() {
            enteredPin += "8"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_9.setOnClickListener() {
            enteredPin += "9"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }

        circle_0.setOnClickListener() {
            enteredPin += "0"
            MakeColoredCircle(enteredPin)
            if (enteredPin.length == 4) {
                CheckCorrect(enteredPin, truePin)
            }
        }


        icon_delete.setOnClickListener() {
            if (enteredPin.length > 0) {
                enteredPin.dropLast(1)
                MakeInvisibleCircle(enteredPin)
            }
        }
    }

    private fun CheckCorrect(enteredPin: String, truePin: String) {
        if (CompairPins(enteredPin, truePin)) {
            Toast.makeText(
                applicationContext,
                "Успешно",
                Toast.LENGTH_SHORT
            )
        } else {
            Toast.makeText(
                applicationContext,
                "Неверный пинкод",
                Toast.LENGTH_SHORT
            )
        }
    }

    private fun CompairPins(enteredPin: String, truePin: String): Boolean{
        return enteredPin == truePin
    }

    private fun MakeColoredCircle(enteredPin: String){
        if (enteredPin.length == 1){
            fill_1.visibility = View.VISIBLE
        }
        else if (enteredPin.length == 2){
            fill_2.visibility = View.VISIBLE
        }
        else if (enteredPin.length == 3){
            fill_3.visibility = View.VISIBLE
        }
        else if (enteredPin.length == 4){
            fill_4.visibility = View.VISIBLE
        }
    }

    private fun MakeInvisibleCircle(enteredPin: String){
        if (enteredPin.length == 1){
            fill_1.visibility = View.INVISIBLE
        }
        else if (enteredPin.length == 2){
            fill_2.visibility = View.INVISIBLE
        }
        else if (enteredPin.length == 3){
            fill_3.visibility = View.INVISIBLE
        }
        else if (enteredPin.length == 4){
            fill_4.visibility = View.INVISIBLE
        }
    }
}