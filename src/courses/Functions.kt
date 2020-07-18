package courses


class Functions {
/* function definition
use the keyword fun
*/
fun funtion1() {
fun sayHello() {
   print("hello")
}
}
/* function parameters
function parameters
*/
fun funtion2() {
fun sayHello(name: String) {
    print("hello , $name")
}
}
/* default parameters
default parameters
*/
fun funtion3() {
fun sayHello(name: String = "world") {
    print("hello , $name")
}
}
/* named parameters
named parameters
*/
fun funtion4() {
fun sayHello(greeting: String = "hello, ", name: String = "world") {
    print("$greeting , $name")
}
    sayHello() // hello, world
    sayHello(name = "John") // hello, John
    sayHello("bye, ", "Else") // bye, Elsa
}

/* return types
return types after function name
*/
fun funtion4a() {
fun sayHello() : String {
  return "hello, world"
}
val y: String = sayHello()
}

/* closure
the value is wrapped in a closure
*/
fun funtion5() {
    val name = "world"
    fun sayHello() {
        print("hello , $name")
    }
    sayHello() // hello, world
}

/* anonymous function
a function assigned to a var
*/
fun funtion6() {
var sayHello = fun(name: String) { print(name) }
sayHello("hello, world")
}
}
/* lambda
de definition of a lambda
*/
fun funtion7() {
var sayHello = { name: String -> print(name) }
sayHello("hello, world")
}


/* higher order functions
a function with a lambda as parameter
*/
fun funtion8() {
var sayHello = { print("hello, world") }
fun say (lmbd: () -> Unit) {
  lmbd()
}
say (sayHello)
}




