package com.leetcode.company.wb.kotlin

fun main(args: Array<String>) {
    println("test ex!!!")
    val a = 1
    val b = 2

    //if case 01
    val max = if (a > b) a else b
    println("[if] max의 값은 $max")

    //if case 01
    val max2 = if (a > b) {
        a
    } else {
        b
    }
    println("[if] max2의 값은 $max2")

    //when case01 (java의 switch)
    when (a) {
        1 -> println("[when] 1이다")
        2 -> println("[when] 2이다")
        else -> println("[when] 암것도 아니다")
    }

    //when case02 (java의 switch) (인수생략 가능, 생략 시에는 bool식)
    /*when {
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }*/

    //for
    val num = arrayOf(10, 20, 30, 40)

    for (n in num) {
        println(n) // 1; 2; 3; 4;
    }
    for (n in 1..2) {
        println(n) // 1; 2
    }
    for (n in num.indices) {  //index 가짐
        println(n) // 1; 2
        println(num[n])
    }

    //List
    val name = listOf<String>("suzan", "tom")
    val name2 = listOf("suzan", "tom")

    //map
    val age = mapOf(0 to 19, 1 to 22, 2 to 31)
    println(age)

    val age2 = mutableMapOf(0 to 19, 1 to 22, 2 to 31)
    age2[4] = 99
    println(age2)

}
