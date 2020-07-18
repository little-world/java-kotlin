package courses


class Enumeration {

enum class Order {
FiRST, SECOND, THIRD
}

enum class Order2(val text: String) {
FiRST("one"),
SECOND("two"),
THIRD("three")
}

enum class Order3 {
FiRST {
    override fun next() = SECOND
},
SECOND {
    override fun next() = THIRD
},
THIRD  {
    override fun next() = FiRST
};
abstract fun next(): Order3
}

/* enumeration
declare an enumeration
*/
fun function1() {
var order = Order.FiRST
}
fun function2() {
var order = Order.FiRST
var y = when(order) {
    Order.FiRST -> "one"
    Order.SECOND -> "two"
    Order.THIRD -> "three"
    else -> "none"
}

}

fun function3() {
var order = Order2.FiRST
var y = order.text

}

fun function4() {
var order = Order3.FiRST
var y = order.next()

}
}



}
