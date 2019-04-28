package Another_Test

/*
    [5,1,3]	    1	1
    [4,1,3,5]	2	3
 */

class Programers_3 {
    fun solution(grade: IntArray, max_diff: Int): Int {
        var answer = 0
        var max_num = grade.max()!!.toInt()
        var min_num =grade.min()!!.toInt()
        var sorted_grade = grade.toSortedSet()
        println(sorted_grade)

        if((max_num.minus(min_num))>max_diff)
            return 1

        for(num in grade){
            //val max=
        }
        return answer
    }
}

fun main(){

}