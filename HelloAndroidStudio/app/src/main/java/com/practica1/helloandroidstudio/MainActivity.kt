package com.practica1.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //leccion1
        //variablesYConstantes()

        //leccion2
        //tiposDeDatos()

        //leccion3
        //sentenciaIf()

        //Leccion4
        //sentenciaWhen()

        //Lenccion5
        arrays()
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

    private fun tiposDeDatos(){
        //String
        val myString: String = "Hola DaoCastro!!!"
        val myString2 = "Hola Mundo!!!"
        val myString3: String = myString + "  " + myString2
        println(myString3)

        //Enteros

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3:Int = myInt + myInt2
        println(myInt3)

        //Decimales(float, double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean

        val myBoll: Boolean = true
        val myBoll2 = false
        println(myBoll2 == myBoll2)
    }

    private fun sentenciaIf(){
        val myNumber = 20

        if ((myNumber <= 10 && myNumber == 5) || myNumber == 53){
            println("$myNumber es menor o igual que 10, o mayor que 5, o igual a 53")
        }else if (myNumber == 66){
            println("$myNumber es igual a 66")
        } else if (myNumber != 70){
            println("$myNumber es diferente de 70")
        } else{
            println("$myNumber es mayor que 10, o menor que 5, o diferente de 53")
        }
    }

    fun sentenciaWhen(){
        val country = "España"

        when(country){
            "España", "Mexico", "Colombia", "Peru"->{
                println("El idioma es español")
            }"EEUU" ->{
                println("El idioma es ingles")
            }"Francia" ->{
                println("El idioma es Frances")
            }else->{
                println("No se encontro el idioma seleccionado")
            }
        }

        val age = 3

        when(age){
            0, 1, 2 ->{
                println("Eres un Bebe")
            } in 3.. 10 ->{
                println("Eres un nino")
            } in 11.. 17 ->{
                println("Eres un adolecente")
            } in 18.. 69 -> {
                println("Eres un Adulto")
            } in 70.. 99 ->{
                println("Eres un anciano")
            }else ->{
                println("eres eterno LOL")
            }
        }
    }

    fun arrays(){
        val name = "Eduardo"
        val surname = "Moure"
        val company = "Solutions Center"
        val age = "32"

        val myArray: ArrayList<String> = arrayListOf<String>()

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))
        println(myArray)

        val myCompany: String = myArray[2]
        println(myCompany)

        myArray[5] = "Aprendiendo KOTLIN"
        println(myArray)




    }
}