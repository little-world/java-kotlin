package courses;

class Flow {

int x = 3;

/*  if
if x is smaller then 3 print 'small'
*/
void if_example() {
if (x < 3)
    System.out.println("small");


}

/* if else
if x is smaller then 3 print 'small'
else print 'big'
*/
void if_else() {
String size = "";
if (x < 3)
    size = "small";
else
    size = "big";

String y = x < 3 ? "small"
                 : "big";

}

/* switch
a jump table
*/
void switch_example() {
String name = "";
switch (x) {
    case 1:
    case 2:
        name = "one or two";
        break;
    case 3:
        name = "three";
        break;
    default:
        name = "?";
}
}

/* while loop
prints 012
*/
void while_loop() {
int x = 0;
while (x < 3) {
    System.out.print(x);
    x++;
}

}

/* for loop
prints 012
*/
void for_loop() {
for (int x = 0; x < 3; x++) {
    System.out.print(x);
}

}
}
