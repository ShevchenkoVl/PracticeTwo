package com.practicetwo

class Dog(enviroment: LifeEnviroment,private val isWild: Boolean, private val specious: String):Animal(enviroment),Voiceable {
    override fun move(){
        println("Dog run")
    }

    override fun VoiceLoud() {
        println("The dog is barking!")
    }

    override fun VoiceQuiet() {
        println("The dog is whining")
    }
}