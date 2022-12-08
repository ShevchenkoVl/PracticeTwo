package com.practicetwo

class Fish(enviroment: LifeEnviroment,private val specious: String):Animal(enviroment) {
    override fun move(){
        println("Fish swim")
    }
}