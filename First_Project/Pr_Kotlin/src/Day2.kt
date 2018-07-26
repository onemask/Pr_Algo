/***
 * 30 _ *****Function.
 *
 ***/
//(kotlin에서 Unit은 무엇을 말하는겨?


fun main(args:Array<String>):Unit {

    println(myFunction())
    println(myFunction() + 10)
    println(myFunction2())

}

fun myFunction():Int{
    val a=3
    val b=6
    println("a : $a b: $b")
    return a+b //함수를 호출했던 위치로 돌아감.

}

fun myFunction2()=3.0+7 //함수의 반환 타입, Return값도 생략 가능(추론가능시)

//함수 선언하기.
// fun 식별자() : 반환타입
//{
//      수행할 문장 .
//}
