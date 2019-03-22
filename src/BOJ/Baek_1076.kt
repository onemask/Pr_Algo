package BOJ

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {

    /*
            색	값	곱
            black	0	1
            brown	1	10
            red	2	100
            orange	3	1000
            yellow	4	10000
            green	5	100000
            blue	6	1000000
            violet	7	10000000
            grey	8	100000000
            white	9	1000000000

     */
    val resistance: ArrayList<String> =
        arrayListOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gey", "white")

    val a = readLine()
    val b = readLine()
    val c = readLine()
    var answer: Long = 0

    for (idx in resistance.indices) {
        if (resistance[idx].equals(a))
            answer += idx * 10
    }

    for (idx in resistance.indices) {
        if (resistance[idx].equals(b))
            answer += idx
    }


    for (idx in resistance.indices) {
        if (resistance[idx].equals(c)) {
            answer *= Math.pow(10.0,idx.toDouble()).toLong()
        }
    }
    println(answer)

}
