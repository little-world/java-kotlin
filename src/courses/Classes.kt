package courses

import java.awt.Color
import java.awt.Point

class Classes {
/* class
A class with fields and method
*/
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

/* inheritance
A Pixel is a Point with color
*/
fun inheritance() {
class Pixel : Point() {
    var color = Color.black
}
val p = Pixel()
p.move(3, 3)
p.color = Color.red
}

/* constructor
A constructor in a init function
*/
fun constructor() {
class Point(var x: Int, var y: Int)

val p = Point(2, 2)
}

/* getters and setters

*/
fun getters_and_setters() {
class Point {
    var x = 0
    var y = 0
}
}

/* access modifiers
public, protected, package, private
*/
fun access() {
class Point {
    private val a = 0
    protected var b = 0
    var c = 0
    var d = 0
}
}

/* override
an Oval is a Shape
*/
fun override_example() {
open class Shape {
    open fun draw() {}
}

class Oval : Shape() {
    override fun draw() {}
}
}

/* abstract class
Shape is abstract
*/
fun abstract_example() {
abstract class Shape {
    abstract fun draw()
}

class Oval : Shape() {
    override fun draw() {}
}
}

/* interface
implements an interface
*/
fun interface_example() {
internal interface Drawable {
    fun draw()
}

class Oval : Drawable {
    override fun draw() {}
}
}
}
