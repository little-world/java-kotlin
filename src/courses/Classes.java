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
    }

    void pixel_class() {
        class Pixel extends Point {
            Color color = Color.black;
        }
        Pixel p = new Pixel();
        p.move(3, 3);
        p.color = Color.red;
    }

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

    void getters_and_setters() {
         class Point {
            int x, y;
            public int getX()       { return x; }
            public void setX(int x) { this.x = x; }
            public int getY()       { return y; }
            public void setY(int y) { this.y = y; }
        }
    }
    static void doe() {}

    void access() {
        class Point {
            private int a;
            protected int b;
            int c;
            public int d;

        }

    }
}
