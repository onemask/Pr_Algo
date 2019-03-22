package BOJ

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {

    val resistance = ArrayList<List<String>>().apply {
        add(listOf("balck", "0", "1"))
        add(listOf("brown", "1", "10"))
        add(listOf("red", "2", "100"))
        add(listOf("orange", "3", "1000"))
        add(listOf("yellow", "4", "10000"))
        add(listOf("green", "5", "100000"))
        add(listOf("blue", "6", "1000000"))
        add(listOf("violet", "7", "10000000"))
        add(listOf("grey", "8", "100000000"))
        add(listOf("white", "9", "1000000000"))
    }

    var answer: Long?
    val a = readLine()
    val b = readLine()
    val c = readLine()

    for(idx in 0..resistance.size-1){
        when(a){
            resistance[idx][0]->{
                answer?.plus((resistance[idx][1]).toLong()*10)
            }
        }
        when(b){
            resistance[idx][0]->{
                answer?.plus((resistance[idx][1]).toLong()*1)
            }
        }
        when(c){
            resistance[idx][0]->{
                answer?.times(resistance[idx][2].toLong())
            }
        }

    }

    if(a.equals("black"))
        println(0)
    else
    println(answer)
}

//        }
//            if (inputs.poll().equals(resistance[idx][0])) {
//
//            if (inputs.poll().equals(resistance[idx][0])) {
//
//            }
//            when (inputs.poll().equals(resistance[idx][0])) {
//                a -> {
//                    println("${a}는 ${(resistance[idx][1])}")
//                    answer = (answer?.plus((resistance[idx][1])))
//                }
//                b -> {
//                    println("${b}는 ${(resistance[idx][1])}")
//                    answer = (answer?.plus((resistance[idx][1])))
//                }
//                c -> {
//                    println("${c}는 ${(resistance[idx][2])}")
//                    answer = (answer?.plus((resistance[idx][2])))
//                }
//            }
//        }


