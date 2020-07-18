package courses;

class NullPointer {

/* assign null
you can not assign null to a var;
*/
void function0() {
String name = "hello";
name = null; // allowed
}

/* assign null
you can not assign null to a variable
*/
void function1() {
String name = "hello";
name = null; // allowed
}

/* check not null
prints name.length if name is not null
*/
void function2() {
String name = "hello";
if (name != null)
  System.out.println(name.length());
}

/* check not null
prints name.length if name is not null, otherwise -1
*/
void function3() {
String name = "hello";
System.out.println(name != null ? name.length(): -1);
}

/* not null
you guess it's never null
*/
void function4() {
String name = "hello";
System.out.println(name.length());
}

/* lateinit var
field variables defaults to null
*/
void function5() {
String name;
name = "hello";
}

}
