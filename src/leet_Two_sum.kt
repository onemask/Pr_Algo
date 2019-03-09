fun main(arg: Array<String>) {


    val input: IntArray = intArrayOf(2, 7, 11, 15)
    val target = 9
    val solution = Solution()

    println(solution.twoSum(input,target).toList())
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val inputArray: IntArray = nums
        var arr : IntArray? = intArrayOf()

        for (idx in inputArray.indices){
            if(target > nums[idx]  ){
                arr = arr?.plus(idx)
            }
        }
        return arr!!
    }

}
