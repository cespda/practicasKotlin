package com.practica1.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()
    }

    private fun variablesYConstantes(){

        var myFirstVariable = "Hola Prueba UNO"
        println(myFirstVariable)

        myFirstVariable = "HOLA PRUEBA DOS"
        println(myFirstVariable)

        var mySecondVariable = "Avance prueba LECCION 1"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        myFirstVariable = "PRUEBA VARIABLES"
        println(myFirstVariable)

        //constantes

        val myFistconstant = "TUTORIAL DE KOTLIN."
        println(myFistconstant)

        val mySecondConstant: String = myFirstVariable
        println(mySecondConstant)
    }

}