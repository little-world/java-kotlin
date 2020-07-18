package courses;


class Functions {
 /* function definition
 use the keyword fun
 */
void funtion1() {
void sayHello () {
  System.out.println("hello");
}
}

 /* function parameters
 function parameters
 */
void funtion2() {
void sayHello(String name){
  System.out.println("hello" + name);
}
}

 /* default parameters with overloading
 default parameters
 */
void funtion3() {
void sayHello (String name){
  System.out.println("hello" + name);
}
void sayHello () {
  System.out.println("hello" + "world");
}
}

 /* parameters in order
 named parameters
 */
void funtion4() {
void sayHello (String greeting, String name){
  System.out.println(greeting", " + name);
}
sayHello("bye, ", "Else") // bye, Elsa
}

/* return types
return types in front of function name
*/
String funtion4a() {
String sayHello() {
   return "hello, world";
}
String y = sayHello();
}



 /* field variables
 fields can be accessed in a method
 */
void funtion5() {
String name = "world";
void sayHello () {
  System.out.println("hello, " + name);
}
sayHello() // hello, world
}

 /* anonymous inner class
 Java has anonymous inner classes
 */
void funtion6() {
interface Print {
  void apply(String name);
}
Print p = new Print() {
  @Override
  public void apply(String name) {
    System.out.println(name);
  }
};
p.apply("hello, world");
}

 /* lambda
 de definition of a lambda
 */
void funtion7() {
interface Print {
  void apply(String name);
}
Print p = (String name) -> {
  System.out.println(name);
};
p.apply("hello, world");
}


 /* higher order functions
 a function with a interface as parameter
 */
void funtion8() {
interface Print {
  void apply();
}

void say (Print print){
  print.apply();
}
say(() -> System.out.println("hello, world"));
}
}




