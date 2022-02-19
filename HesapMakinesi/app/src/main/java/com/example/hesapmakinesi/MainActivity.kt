package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun butontik (view : View){

        if(yenioperator){
            hesaplama.text = ""
        }
        yenioperator = false

        var butonsec = view as Button
        var butondeger:String = hesaplama.text.toString()

        when(butonsec.id){
            sayi0.id->{
                butondeger += "0"
            }
            sayi1.id->{
                butondeger += "1"
            }
            sayi2.id->{
                butondeger += "2"
            }
            sayi3.id->{
                butondeger += "3"
            }
            sayi4.id->{
                butondeger += "4"
            }
            sayi5.id->{
                butondeger += "5"
            }
            sayi6.id->{
                butondeger += "6"
            }
            sayi7.id->{
                butondeger += "7"
            }
            sayi8.id->{
                butondeger += "8"
            }
            sayi9.id->{
                butondeger += "9"
            }
        }
        hesaplama.setText(butondeger)

    }

    var operator = "*"
    var eskisayi = ""
    var yenioperator = true

    fun butonislem(view: View){

        var butonsec2 = view as Button

        when(butonsec2.id){
            bolu.id->{
                operator = "/"
            }
            eksi.id->{
                operator = "-"
            }
            arti.id->{
                operator = "+"
            }
            carpi.id->{
                operator = "*"
            }

        }
        eskisayi = hesaplama.text.toString()
        yenioperator = true
    }

    fun butonhesapla(view: View){
        var yenisayi = hesaplama.text.toString()
        var sonuc : Double? = null
        when(operator){
            "/" -> {
                sonuc = eskisayi.toDouble() / yenisayi.toDouble()
            }
            "*" -> {
                sonuc = eskisayi.toDouble() * yenisayi.toDouble()
            }
            "+" -> {
                sonuc = eskisayi.toDouble() + yenisayi.toDouble()
            }
            "-" -> {
                sonuc = eskisayi.toDouble() - yenisayi.toDouble()
            }
        }
        hesaplama.setText(sonuc.toString())
        yenioperator = true
    }

    fun ac (view: View){
        hesaplama.setText("0")
        yenioperator =true
    }



}