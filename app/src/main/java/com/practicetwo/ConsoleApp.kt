package com.practicetwo

fun main() {
    val dogWolf= Dog(Animal.LifeEnviroment.GROUND,isWild = true, specious = "grey wolf")
    val dogAlabai = Dog(Animal.LifeEnviroment.GROUND,isWild = false, specious = "Alabai")
    val dogHusky = Dog(Animal.LifeEnviroment.GROUND,isWild = false, specious = "Husky")
    val fish = Fish(Animal.LifeEnviroment.WATER, specious = "White shark")
    val bird = Bird(Animal.LifeEnviroment.SKY, specious = "Some bird")

    val animals = listOf(fish,bird,dogWolf)
    animals.forEach(){
        it.move()
    }

}