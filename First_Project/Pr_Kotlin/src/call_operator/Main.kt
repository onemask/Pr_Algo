package call_operator

import inheritance.Person;
import inheritance.Student;

class Professor(name : String, age : Int):Person(name,age)

fun main(args:Array<String>){

    val person : Person = Student("KKK",33,"KOREA")
    println("${person is Person}")
    println("${person is Student}")
    println("${person is Professor}")

    val person2 : Person = Professor("Kim",48)
    println("${person2 is Person}")
    println("${person2 is Student}")
    println("${person2 !is Professor}")


}
