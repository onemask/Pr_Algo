package ex_Exception

import org.omg.PortableInterceptor.INACTIVE
import javax.management.Query.div

fun throwing(): Nothing = throw Exception()

fun main(args:Array<String>){
    println("start")
    val i:Int = throwing()
    println(i)

}
