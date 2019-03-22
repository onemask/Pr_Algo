package BOJ

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    var inputNum = sc.nextInt()
    val br = InputStreamReader.nullReader()

    while (inputNum-- < 0) {
        var arrayList = ArrayList<Int>()
        var line = sc.nextLine()
        for (idx in 0..line.length - 1) {
            if (line[idx].toInt() > 0) {
                arrayList.add(line[idx].toInt())
            }
        }
            arrayList.forEach {

            }

    }
}