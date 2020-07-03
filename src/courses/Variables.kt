package courses

class Variables {
    
/* variables
declare x and y as an int
plus and print
*/
fun variables() {
val x = 3
val y: Int
y = x + 3
println(y)
}

/* constants
declares x and y as a constant
*/
fun constant() {
val x = 3
val y: Int
y = x + 3
}

/* types
All numbers are classes
*/
fun types() {
val x = 3
val l: Long = 100
val d = 3.14
val b = true
val s = "hello"
}

/* type cast
all cast are expicit
*/
fun typecast() {
val x = 3
val d = x.toDouble()
val y = d.toInt()
}

/* operators
basic math operators
*/
fun operators() {
val a = 4
val b = 3
var c: Int
c = a + b // 7
c = a - b // 1
c = a * b // 12
c = a / b // 1
c = a % b // 1
}
}
