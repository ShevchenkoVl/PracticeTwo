package com.practicetwo

class Bird(enviroment: LifeEnviroment,private val specious: String):Animal(enviroment),Voiceable {
    override fun move(){
        println("Bird fly")
    }

    override fun VoiceLoud() {
        println("The bird is screaming")
    }

    override fun VoiceQuiet() {
        println("The bird is singing")
    }
}