package inheritance
/*
 * 64 상속
 */

open class Person(val name: String,val age: Int)

class Student (name :String,age : Int,val country : String) : Person(name,age)

fun main (args:Array<String>){

    var peron = Person("도라에몽",200)
    var student = Student("진구",18,"Japan")
}