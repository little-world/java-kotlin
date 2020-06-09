package courses;


import java.awt.*;

public class Classes{

    void point_class() {
        class Point {
            int x, y;
            void move(int a, int b) {
                x +=a; y+= b;
            }
        }
        Point p = new Point();
        p.move(3, 3);
        /// A class with fields and method
    } //

    void inheritance() {
        class Pixel extends Point {
            Color color = Color.black;
        }
        Pixel p = new Pixel();
        p.move(3, 3);
        p.color = Color.red;
        /// A Pixel is a Point with color
    } //

    void constructor( ){
        class Point {
            int x, y;
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
        Point p = new Point(2,2);
        /// A constructor in a init function
    } //

    void getters_and_setters() {
         class Point {
            int x, y;
            public int getX()       { return x; }
            public void setX(int x) { this.x = x; }
            public int getY()       { return y; }
            public void setY(int y) { this.y = y; }
        }
        /// getters and setters
    } //
    static void doe() {}

    void access() {
        class Point {
            private int a;
            protected int b;
            int c;
            public int d;
        }
        // public, protected, package, private
    } //

    void override_example() {
        class Shape {
            void draw() {}
        }

        class Oval extends Shape {
            @Override
            void draw() {}
        }
        /// an Oval is a Shape
    } //


    void abstract_example() {
        abstract class Shape {
            abstract void draw();
        }

        class Oval extends Shape {
            @Override
            void draw() {}
        }
        /// Shape is abstract
    } //

    interface Drawable {
        void draw();
    }

    void interface_example() {
        class Oval implements Drawable {
            @Override
            public void draw() {}
        }
        /// implements an interface
    } //
}
