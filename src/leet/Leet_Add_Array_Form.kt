/*
package leet

*/
/*
    Input: A = [1,2,0,0], K = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234
*//*




class Leet_Add_Array_Form {
    fun addToArrayForm(A : IntArray, K:Int):List<Int>{
        var total : String =""
        //var answer_array = listOf()

        println("a is Iterable ${A.asIterable().iterator()}")

        for (num in A){
            total+=num
        }

        var now_answer =(total.toInt()).plus(K)
        println("now_answer $now_answer")


        while (now_answer >0){
            val something = now_answer%10
            answer_array.plus(something)
            now_answer/=10
        }

        println("answer_array ${answer_array.toList().iterator()}")



        return answer_array
    }
}

fun main(arg: Array<String>){
    val leet_Add_Array_Form = Leet_Add_Array_Form()
    val inputArray = intArrayOf(1,2,0,0)
    val inputInt = 34

    println("main ${leet_Add_Array_Form.addToArrayForm(inputArray,inputInt)}")


}
*/
