/***
 *  37_ 지역변수와 전역변수의 이름이 중복될때.
 */

var a=5     //전역.

fun main (args: Array<String>) {
    val a=30
    println(a)      //가장 가까운 스코프의 변수 출력. 
    func()


}

fun func() {
    println(a)
}

