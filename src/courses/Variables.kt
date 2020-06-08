package courses

class Variables {
    fun variables() {
        val x = 3
        val y: Int
        y = x + 3
        println(y)
        // declare x and y as an int
        // plus and print
    }

    fun constant() {
        val x = 3
        val y: Int
        y = x + 3
        // declares x as a constant
    }

    fun types() {
        val l: Long = 100
        val d = 3.14
        val b = true
        val s = "hello"
        // other primitive types
        // Everything is a class
    }

    fun typecast() {
        val x = 3
        val d = x.toDouble()
        val y = d.toInt()
        // all typecasts are explicit
    }

    fun operators() {
        val a = 4
        val b = 3
        var c: Int
        c = a + b // 7
        c = a - b // 1
        c = a * b // 12
        c = a / b // 1
        c = a % b // 1
        // basic math operators
    }
}
