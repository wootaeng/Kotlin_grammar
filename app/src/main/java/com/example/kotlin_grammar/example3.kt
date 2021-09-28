package com.example.kotlin_grammar

//5. Array and List

//Array 배열
//메모리가 이미 할당이 되어있다

//List
// 1. List  수정이 불가능한 리스트
// 2 MutableList 수정이 가능한 리스트

fun array(){
    val array:Array<Int> = arrayOf(1,2,3)
    val list:List<Int> = listOf(1,2,3)

    val array2:Array<Any> = arrayOf(1,"d",3,4f)
    val list2:List<Any> = listOf(1,"d",11L)

    array[0] = 3
//    list[0] = 2 //수정 불가능
    var result:Int = list.get(0) //list는 값을 가져와서 특정 변수에 넣는 것은 가능

//    var arrayList:ArrayList<Int> = arrayListOf<Int>()
    val arrayList:ArrayList<Int> = arrayListOf<Int>() //val 도 가능
    arrayList.add(10)
    arrayList.add(20)


}