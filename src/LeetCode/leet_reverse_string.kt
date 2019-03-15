package LeetCode

class Solution_reverse {
    fun reverseString(s: CharArray): Unit {
        return s.reverse()
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class SwapNodes() {
    fun swapPairs(head: ListNode?): ListNode? {
        val seq = generateSequence(head) { it.next }
        fun swapNode(node1: ListNode, node2: ListNode) {
            val temp = node1.`val`
            node1.`val` = node2.`val`
            node2.`val` = temp
        }
        seq.fold<ListNode, ListNode?>(null)
        { acc, listNode ->
            acc?.also { swapNode(acc, listNode) }; if (acc == null) listNode else null
        }
        return null
    }
}

fun main(args: Array<String>) {
    val test = SwapNodes()
    val list = ListNode(1)
    ListNode(2)
    ListNode(3)
    ListNode(4)

    list.next?.run {
        println(list.`val`.toString())
        println(list.next.toString())
    }


    //test.swapPairs(1)
}