package courses

internal class Flow {
    var x = 3
    fun if_example() {
        if (x < 3) println("small")
        /// if x is smaller then 3 print 'small'
    } //

    fun if_else() {
        var size = ""
        size = if (x < 3) "small" else "big"
        val y = if (x < 3) "small" else "big"
        /// if x is smaller then 3 print 'small'
        // else print 'big'
    } //

    fun switch_example() {
        var name = ""
        name = when (x) {
            1, 2 -> "one or two"
            3 -> "three"
            else -> "?"
        }
        /// a pattern matching
    } //

    fun while_loop() {
        var x = 0
        while (x < 3) {
            print(x)
            x++
        }
        /// the old fashion while
    } //

    fun for_loop() {
        for (x in 0..2) {
            print(x)
        }
        /// a range: 012
    } //
}
