package courses

import java.awt.Color
import java.awt.Point

class Classes {
    fun point_class() {
        class Point {
            var x = 0
            var y = 0
            fun move(a: Int, b: Int) {
                x += a
                y += b
            }
        }

        val p = Point()
        p.move(3, 3)
    }

    fun pixel_class() {
        open class Point {}
        class Pixel : Point() {
            var color = Color.black
        }
        val p = Pixel()
        p.color = Color.red
        // classes are final by default
        // open the class for inheritance
    }

    fun constructor() {
        class Point(var x: Int, var y: Int)

        val p = Point(2, 2)
    }

    fun getters_and_setters() {
        class Point {
            var x = 0
            var y = 0

        }
        // getter and setter are default
    }

    fun access() {
        open class Point {
            private val a = 0
            protected open var b = 0
            internal var c = 0  // inside module
            var d = 0
        }
    }

    companion object {
        fun doe() {}
    }
}
