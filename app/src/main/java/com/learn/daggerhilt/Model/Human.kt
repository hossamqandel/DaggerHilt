package com.learn.daggerhilt.Model

import javax.inject.Inject

class Human @Inject constructor(private val food: Food) {

    fun getEat(): String {
        return food.eatSpagitti()!!
    }
}