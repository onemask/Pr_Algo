package ex_Any_class

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other
import java.util.*

fun main (args:Array<String>){

    val building =Building("코틀린",area = 100)
    val buidling2 = Building("김수연",date = "5월14일",area = 200)

    printObject(building)
    printHashCode(buidling2)
    building.equals(buidling2)
}

fun printObject(any: Any){
    println(any.toString())
}

fun printHashCode(any: Any){
    println(any.hashCode())
}
fun printEquals(another:Any):Boolean {
    var flag : Boolean = true
    if(another==another){
        println(flag)
        return true

    }
    else{
        flag= false
        return flag
        println(flag)
    }
}
