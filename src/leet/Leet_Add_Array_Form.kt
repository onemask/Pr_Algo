package leet

class Leet_Add_Array_Form {
    fun addToArrayForm(A : IntArray, K:Int):List<Int>{
        var total = 0
        val answer_array = arrayListOf<Int>()
        for (num in A){
            total+=num
        }
        total.plus(K)
        print(total)
        return answer_array
    }
}

fun main(arg: Array<String>){
    val leet_Add_Array_Form = Leet_Add_Array_Form()


}