package courses

internal class Flow {
var x = 3

/*  if
if x is smaller then 3 print 'small'
*/
fun if_example() {
if (x < 3)
    println("small")
}

/* if else
if x is smaller then 3 print 'small'
else print 'big'
*/
fun if_else() {
    val x = 3
    var size = if (x < 3)
        "small"
    else
        "big"
}

/* switch
a jump table
*/
fun switch_example() {
val x = 1
var y = when (x) {
    1, 2 -> "one or two"
    3 -> "three"
    else -> "zero"
}
}

/* while loop
prints 012
*/
fun while_loop() {
var x = 0
while (x < 3) {
    print(x)
    x++
}
}

/* for loop
prints 012
*/
fun for_loop() {
for (x in 0..2) {
    print(x)
}
}
}
