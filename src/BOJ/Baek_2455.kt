package BOJ

import java.util.*
import kotlin.collections.ArrayList

fun main(args : Array<String>){

    var check  = 0
    val read = Scanner(System.`in`)
    var people : ArrayList<Int> = arrayListOf(0)

    do{
        val minus = read.nextInt() * (-1)
        val plus = read.nextInt()
        people.add((people.last())+minus+plus)
        if(minus * plus == 0){
            check++
        }
    }while(check<2)


    println(people.max())

}