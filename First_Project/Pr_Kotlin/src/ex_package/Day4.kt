package ex_package

val person = object {
    val name :String ="심슨"
    val age : Int = 45
}

val person2 = object{
    val name : String = "마지 "
    val age : Int = 40
}

val person3 = object{
    val name: String = "아들심슨"
    val age : Int = 15
}

class Person {

    var name : String = ""
    var age : Int = 0

}

fun main (args: Array<String>){
    val person1 : Person
    person1 = Person()
    person1.name = "심슨"
    person1.age = 45

    val person2 : Person
    person2 = Person()
    person2.name = "머지"
    person2.age = 40

    val person3 : Person
    person3 = Person()
    person3.name = "아들심슨"
    person3.age = 15

}