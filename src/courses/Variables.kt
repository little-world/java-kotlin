package courses

class Variables {

/* variables
declare x and y as an int
plus and print
*/
fun variables() {
var x = 3
var y: Int
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
var x = 3
var l: Long = 100
var d = 3.14
var b = true
var s = "hello"
}

/* type cast
all cast are expicit
*/
fun typecast() {
var x = 3
var d = x.toDouble()
var y = d.toInt()
}


/* operators
basic math operators
*/
fun operators() {
var a = 4
var b = 3
var c: Int
c = a + b // 7
c = a - b // 1
c = a * b // 12
c = a / b // 1
c = a % b // 1
}
}
