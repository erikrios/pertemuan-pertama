package com.erikriosetiawan

fun main() {

    println("Enter Two  Number")
    val (a, b) = readLine()!!.split(' ')

    println("Max number is : ${maxNumber(a.toInt(), b.toInt())}")
}

fun maxNumber(a: Int, b: Int): Int {
    val max = if (a > b) {
        println("The value of a is $a")
        a
    } else {
        println("The value of b is $b")
        b
    }
    return max
}
