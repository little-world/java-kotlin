package courses

internal class Flow {
    var x = 3
    fun if_example() {
        if (x < 3) println("small")
        // if x is smaller then 3 print 'small'
    }

    fun if_else() {
        var size = ""
        size = if (x < 3) "small" else "big"
        val y = if (x < 3) "small" else "big"
    }

    fun switch_example() {
        var name = ""
        name = when (x) {
            1, 2 -> "one or two"
            3 -> "three"
            else -> "?"
        }
        // a jump table
    }

    fun while_loop() {
        var x = 0
        while (x < 3) {
            println(x)
            x++
        }
        // prints 0, 1, 2
    }

    fun for_loop() {
        for (x in 0..2) {
            println(x)
        }
        // prints 0, 1, 2
    }
}
