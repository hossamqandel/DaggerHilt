package com.learn.daggerhilt.Model

import javax.inject.Inject

class Food @Inject constructor() {


    fun eatSpagitti():String?{
        return "Spagitti"
    }

}