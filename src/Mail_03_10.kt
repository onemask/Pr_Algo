//import org.w3c.dom.Node
//import org.w3c.dom.NodeList
//import javax.swing.text.html.HTML.Tag.I
//
//fun LeetCode.LeetCode.BOJ.main(args: Array<String>) {
//
//    val input = intArrayOf(4, 6, 7, 8, 1, 2, 3)
//    val target = 5
//
//    fun solution(args: IntArray, target: Int): Int {
//        args.find { it.equals(target) }?.run {
//            return 1
//        } ?: run {
//            return -1
//        }
//    }
//    //println(solution(input, target))
//
//
//    class LeetCode.ListNode(var `val`: Int) {
//        var next: LeetCode.ListNode? = null
//    }
//
//
//    val nodeList: List<Int> = listOf(1, 2, 3, 4)
//
//
//    var a = 1
//    var b = 2
//    a = b.also { b = a }
//    println(a)
//    println(b)
//
//
//
//
//    fun swapPairs(head: Int, list: List<Int>): List<Int>? {
//        for (idx in list) {
//            if (list[idx].equals(head)) {
//                val headIdx = idx
//                val nextIdx = idx + 1
//                list[headIdx] = list[nextIdx].also {
//                    list[nextIdx] = list[headIdx]
//                }
//            }
//        }
//
//        return list
//    }
//}
////
////private operator fun <V> List<V>.set(headIdx: V, value: V) {
////    List() = List[headIdx]=value
////    return List[headIdx]=value
////}
//
//
//
