package courses

import java.util.*

class Array {
/* array
an empty array
*/
fun array() {
val seq = IntArray(2)

seq[0] = 1
seq[1] = 2

val y = seq[0] //1
}

/* array
an array with values
*/
fun array2() {
val seq = intArrayOf(1, 2, 3)

val y = seq[0] //1

seq[1] = 4
}

/* array loop
print 1234
*/
fun array_loop() {
val seq = intArrayOf(1, 2, 3)

for (i in seq.indices) {
    print(seq[i])
}
for (x in seq) {
    print(x)
}
}

/* array list
an empty Lists
*/
fun array_list() {
val list: MutableList<Int> = ArrayList()

list.add(1)
list += 2

val y = list[0] //1
}

/* array list
a List with values
*/
fun array_list2() {
val list = arrayListOf(1, 2, 3)

for (x in list) {
    println(x)
}
}
}
