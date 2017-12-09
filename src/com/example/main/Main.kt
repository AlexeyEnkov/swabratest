package com.example.main

import java.io.FileInputStream
import java.util.*

fun main(args: Array<String>) {
    val aprop = Properties().apply {
        load(FileInputStream("res/aprops/a.properties"))
    }
    println("a=${aprop.getProperty("a")}")

    val genprop = Properties().apply {
        load(FileInputStream("res/genprops/g.properties"))
    }
    println("g=${genprop.getProperty("g")}")
}