package courses

import java.util.*

class Array {
    fun array() {
        val seq = IntArray(2)
        seq[0] = 1
        seq[1] = 2
        val y = seq[0] //1
    }

    fun array2() {
        val seq = intArrayOf(1,2,3,4)
        val y = seq[0] //1
        seq[1] = 4
    }

    fun array_loop() {
        val seq = intArrayOf(1,2,3,4)
        for (i in seq.indices) {
            print(seq[i])
        }
        for (x in seq) {
            println(x)
        }
        // 1234
    }

    fun array_list() {
        val list = ArrayList<Int>()
        list.add(1)
        list += 2
        val y = list[0] //1
    }

    fun array_list2() {
        val list = listOf(1,2,3,4)
        for (x in list) {
            println(x)
        }
    }
}
