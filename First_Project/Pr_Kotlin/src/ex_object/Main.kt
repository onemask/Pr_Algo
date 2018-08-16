package ex_object

fun main(args:Array<String>){
    val person = object {               //person 변수에 object 선언 동시 초기화.
        val name:String = "홍길동"
        val age :Int = 23
    }
    println(person.name)
    println(person.age)

}
