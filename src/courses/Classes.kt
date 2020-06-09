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
        /// a class with fields and method
    } //

    fun inheritance() {
        class Pixel : Point() {
            var color = Color.black
        }

        val p = Pixel()
        p.move(3, 3)
        p.color = Color.red
        /// A Pixel is a Point with color
    } //

    fun constructor() {
        class Point(var x: Int, var y: Int)

        val p = Point(2, 2)
        /// a constructor in a init function
    } //

    fun getters_and_setters() {
        class Point {
            var x = 0
            var y = 0

        }
        // getters and setters
    } //

    fun access() {
        class Point {
            private val a = 0
            protected var b = 0
            var c = 0
            var d = 0
        }
        /// public, protected, package, private
    } //

    fun override_example() {
        open class Shape {
            open fun draw() {}
        }

        class Oval : Shape() {
            override fun draw() {}
        }
        /// an Oval is a Shape
    } //

    fun abstract_example() {
        abstract class Shape {
            abstract fun draw()
        }

        class Oval : Shape() {
            override fun draw() {}
        }
        /// Shape is abstract
    } //

    internal interface Drawable {
        fun draw()
    }

    fun interface_example() {
        class Oval : Drawable {
            override fun draw() {}
        }
        /// implements an interface
    } //

    companion object {
        fun doe() {}
    }
}
