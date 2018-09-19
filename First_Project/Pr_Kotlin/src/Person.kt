/*
 * Chapt 60 :Array[] 사용하기.
 */


class Person(var name:String,var birthday:String) {

    // Operator : 오버로딩 키워드.
    operator fun get(position: Int): String {
        return when (position) {
            0 -> name
            1 -> birthday
            else -> "알수 없음"
        }
    }

    operator fun get(position: Int, value: String) {
        when (position) {
            0 -> name = value
            1 -> birthday = value
        }
    }
}
    fun main(args: Array<String>){
        val person = Person("Kotlin","2018-08-22")
        println(person[0])
        println(person[1])
        println(person[-1])

        //person[0]="java"
        println(person.name)

    }

