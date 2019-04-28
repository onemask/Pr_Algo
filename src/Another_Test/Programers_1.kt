package Another_Test



class Solution {
    fun solution(a: String, b: String): Boolean {
        var answer = true
        if(!(a.equals(b.reversed())))
             answer
        else
            answer = false
        return answer
    }
}
/*
    listen	silent	true
 */

fun main(){
    val test1 = Solution()
    println(test1.solution("listen","slient").toString())
}