package courses;

public class Variables {

    void variables() {
        int x = 3, y;
        y = x + 3;
        System.out.println(y);
        /// declare x and y as an int
        // plus and print
    } //

    void constant() {
        final int x = 3;
        final int y;
        y = x + 3;
        /// declares x as a constant
    } //

    void types() {
        long l = 100;
        double d = 3.14;
        boolean b = true;
        String s = "hello";
       /*other primitive types
         String is a class*/
    } //

    void typecast() {
        int x = 3;
        double d = x;
        int y = (int) d;
        /// int to double implicit cast
        // double to an int explicit cast
    } //

    void operators() {
        int a = 4, b = 3, c;
        c = a + b;   // 7
        c = a - b;   // 1
        c = a * b;   // 12
        c = a / b;   // 1
        c = a % b;   // 1
        /// basic math operators
    } //
}
