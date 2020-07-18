package courses

class NullPointer {

/* assign null
you can not assign null to a var;
*/
fun function0() {
var name: String = "hello"
name = null // forbidden
}

/* assign null
you can not assign null to a var; add ?
*/
fun function1() {
var name: String? = "hello"
name = null // is ok
}

/* safe ? operator
prints b.length if b is not null, otherwise null
*/
fun function2() {
var name: String? = "hello"
println(name?.length)
}

/* elvis operator ?:
prints name.length if b is not null, otherwise -1
*/
fun function3() {
var name: String? = "hello"
print( name?.length ?: -1)
}

/* assert !! not null
you're absolutely certain it's never null
*/
fun function4() {
var name: String? = "hello"
name!!.toUpperCase()
}
/* lateinit var
lateinit is use in dependency injection
*/
fun function5() {
lateinit var name: String
name = "hello"
}



}
