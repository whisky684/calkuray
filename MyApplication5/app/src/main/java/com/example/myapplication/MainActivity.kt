package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1:Int = 0
        var ch = 0
        var pl = ""

        var sum = 0

        b0.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("0")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(0)
                num.setText(str)
            }
        }

        b1.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("1")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(1)
                num.setText(str)
            }
        }

        b2.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("2")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(2)
                num.setText(str)
            }
        }

        b3.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("3")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(3)
                num.setText(str)
            }
        }

        b4.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("4")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(4)
                num.setText(str)
            }
        }

        b5.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("5")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(5)
                num.setText(str)
            }
        }

        b6.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("6")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(6)
                num.setText(str)
            }
        }

        b7.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("7")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(7)
                num.setText(str)
            }
        }

        b8.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("8")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(8)
                num.setText(str)
            }
        }

        b9.setOnClickListener {
            if(num.text.toString() == "0" || ch == 1) {
                num.setText("9")
                ch = 0
            }
            else{
                var str = num.text.toString().plus(9)
                num.setText(str)
            }
        }

        bclear.setOnClickListener {
            num.setText("0")
        }

        bdel.setOnClickListener {
        if(num.text.toString().length <= 1) {
            num.setText("0")

        }
            else if(num.text.isNotEmpty()){
            num.text = num.text.dropLast(1)

        }
        }

        bplus.setOnClickListener {
            num1 = num.text.toString().toInt()
            ch = 1
            pl = "plus"
        }

        bminus.setOnClickListener {
            num1 = num.text.toString().toInt()
            ch = 1
            pl = "minus"
        }

        bmul.setOnClickListener {
            num1 = num.text.toString().toInt()
            ch = 1
            pl = "mul"
        }

        bdiv.setOnClickListener {
            num1 = num.text.toString().toInt()
            ch = 1
            pl = "div"
        }

        bmod.setOnClickListener {
            num1 = num.text.toString().toInt()
            ch = 1
            pl = "mod"
        }


        bequal.setOnClickListener {
            if(pl == "plus") {
                sum = num1 + num.text.toString().toInt()
                num.setText(sum.toString())
            }
            else if (pl == "minus"){
                sum = num1 - num.text.toString().toInt()
                num.setText(sum.toString())

            }
            else if (pl == "mul"){
                sum = num1 * num.text.toString().toInt()
                num.setText(sum.toString())
            }
            else if (pl == "div"){
                sum = num1 / num.text.toString().toInt()
                num.setText(sum.toString())
            }
            else if (pl == "mod"){

                var mod = 0
                sum = num1 % num.text.toString().toInt()

                num.setText(sum.toString())
            }

        }
}
}




