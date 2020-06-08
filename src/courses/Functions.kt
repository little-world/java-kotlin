package courses


class Functions {
    fun method() {
        class Point {
            var x = 0
            var y = 0
            fun move() {
                x += 3
                y += 5
            }
        }

        val p = Point()
        p.move()
    }
}
