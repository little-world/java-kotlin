package courses;


import java.awt.*;

public class Classes{

/* class
A class with fields and method
*/
void point_class() {
class Point {
    int x, y;
    void move(int a, int b) {
        x +=a;
        y+= b;
    }
}
Point p = new Point();
p.move(3, 3);
}

/* inheritance
A Pixel is a Point with color
*/
void inheritance() {
class Pixel extends Point {
    Color color = Color.black;
}
Pixel p = new Pixel();
p.move(3, 3);
p.color = Color.red;
}


/* constructor
A constructor in a init function
*/
void constructor( ){
class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
Point p = new Point(2,2);
}

/* getters and setters

*/
void getters_and_setters() {
class Point {
    int x, y;
    public int getX()       { return x; }
    public void setX(int x) { this.x = x; }
    public int getY()       { return y; }
    public void setY(int y) { this.y = y; }
}
}


/* access modifiers
public, protected, package, private
*/
void access() {
class Point {
    private int a;
    protected int b;
    int c;
    public int d;
}
}

/* override
an Oval is a Shape
*/
void override_example() {
class Shape {
    void draw() {}
}

class Oval extends Shape {
    @Override
    void draw() {}
}
}

/* abstract class
Shape is abstract
*/
void abstract_example() {
abstract class Shape {
    abstract void draw();
}

class Oval extends Shape {
    @Override
    void draw() {}
}
}

/* interface
implements an interface
*/
void interface_example() {
interface Drawable {
    void draw();
}

class Oval implements Drawable {
    @Override
    public void draw() {}
}
}
}
