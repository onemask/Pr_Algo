package BOJ

fun main() {

    var num = readLine()!!.toInt()
    var answer  = mapOf<Int,Int>()
    var idx = 0


    while (num-- != 0) {

        readLine()!!.split(" ").filter {
            it.toInt() % 2 == 0
        }.apply {
            val result = this.map {
                it.toInt()
            }

            println("sum ${result.sum()} min ${result.min()}")
            //answer.put(result.sum(),result.min()!!)
        }

    }
   /* println("answer is $answer")
    println("key is ${answer.keys}")
    println("answer is ${answer.values}")*/

    println("size ${answer.size}")
    answer.forEach { key, value -> println("$key $value")  }

    for(i in 1 .. answer.size){
        println("key ${answer.keys}")
        //println("${answer[i]!!.toInt()} ${answer.get()!!.toInt()}")
    }

}

