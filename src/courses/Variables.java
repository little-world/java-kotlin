package courses;

public class Variables {

/* variables
declare x and y as an int
plus and print
*/
void variables() {
int x = 3, y;
y = x + 3;
System.out.println(y);
}

<<<<<<< HEAD

=======
>>>>>>> origin/master
/* constants
declares x as a constant
*/
void constant() {
final int x = 3;
final int y;
y = x + 3;
}

/* types
other primitive types
String is a class
*/
void types() {
int x = 3;
long l = 100;
double d = 3.14;
boolean b = true;
String s = "hello";
}

/* type cast
int to double implicit cast
double to an int explicit cast
*/
void typecast() {
int x = 3;
double d = x;
int y = (int) d;
}

/* operators
basic math operators
*/
void operators() {
int a = 4, b = 3, c;
c = a + b;   // 7
c = a - b;   // 1
c = a * b;   // 12
c = a / b;   // 1
c = a % b;   // 1
}
}
