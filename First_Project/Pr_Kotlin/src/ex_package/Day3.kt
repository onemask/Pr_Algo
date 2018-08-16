package ex_package

import ex_func.multiple
import ex_package.absolute
import ex_package.max
import ex_package.min
import ex_func.*;
import kotlin.Number

/***
 *  40_ 메모리의 스택영역.
 */

fun main(args: Array<String>){

    val a = -36
    val result = Absolute(a)
    println(a)
}

//입력 받는 정수의 절대값을 반환하는 함수
fun Absolute(number: Int):Int{
    return if(number >=0)
        number
    else -number

}




