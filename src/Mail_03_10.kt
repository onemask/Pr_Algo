fun main(args: Array<String>) {

    val input = intArrayOf(4, 6, 7, 8, 1, 2, 3)
    val target = 5

    fun solution(args: IntArray, target: Int): Int {

        args.find { it.equals(target) }?.run {
            return 1
        }?: run {
            return -1
        }
    }

    println(solution(input,target))
}