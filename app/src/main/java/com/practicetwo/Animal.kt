package com.practicetwo

abstract class Animal (val enviroment: LifeEnviroment){
    abstract fun move()
    open fun sleep()
    {
        println("Animal is sleeping")
    }
    enum class LifeEnviroment
    {
        SKY,WATER,GROUND
    }
}