package com.example.kotlin_grammar

fun main(){
    checkNum(1)
}

//4. 조건식
//기본형태
fun maxBy(a : Int, b : Int) : Int {

    if (a>b){
        return a
    } else {
        return b
    }
}
//아래처럼 표현 가능
fun maxBy2(a : Int, b: Int) = if (a>b) a else b
// return (a>b) ? a:b 자바에서 사용하는 3항연산자가 코틀린에는 없다

//when 사용법
fun checkNum(score : Int){
    when(score){
        0-> println("this is 0")
        1-> println("this is 1")
        2,3 -> println("this is 2 or 3") //복수값도 인정
        else -> println("I don't know") //else 는 생략가능
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3 //변수에 when 을 사용 시에는 else 무조건 사용해야함
    }
    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}
