package com.example.kotlin_grammar

fun main(){
    HelloWorld()

    println(add (4, 5))

    //3. String Template
    val name = "wootaeng"
    val lastName = "Lee"
//    println("my name is wootaeng") 이렇게 출력하고 싶다면
    println("my name is $name") //$+변수 를 작성하면된다
    println("my name is $name I'm 23") //띄어쓰기를 해줘야 변수만 인식한다
    println("my name is ${name}I'm 23") //또는 대괄호로 변수를 감싸줘야한다
    println("my name is ${name + lastName}")

    println("this is 2\$a") //$를 출력하고 싶을때는 $ 앞에 \ 사용한다
}


//1. 함수
// : 다음에는 보통 return type 을 쓴다. 리턴할 타입이 없다면 Unit 또는 생략가능
// 자바에는 int, string , void.. 타입을 지정해서 사용
fun HelloWorld() : Unit {
    println("Hello!!")
}

// 변수명 + 변수타입 순서 //Int 타입시 I 는 대문자
// 리턴 타입이 있을 때는 타입 생략하면 안됨
fun add(a : Int, b : Int) : Int {
    return  a+b
}

//2. val vs var
//val = value 값이 변하지않는 것
//var =  valuable 값이 변하는 것
fun hi(){

    val a : Int = 10
    var b : Int = 9

    //a = 100 이거는 안됨
    b = 100 //이거는 됨

    val c = 100 // 코틀린은 타입을 자동으로 정의해서 Int 를 작성 안해도 된다
    val d = 100
    var name = "wootaeng" //String 을 안써줘도 자동으로 String 으로 인식

    //단, 값을 주지않았을 때는 변수 타입선언해야한다
    //var e 이건 안됨
    var e : String //이건 된다

}
