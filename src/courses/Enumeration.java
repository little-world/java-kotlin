package courses;


class Enumeration {

enum  Order {
FiRST, SECOND, THIRD
}

enum Order2 {
FiRST("one"),
SECOND("two"),
THIRD("three");

String text;
Order2(String text) {
this.text = text;
}
}

enum  Order3 {
FiRST {
 @Override
 Order3 next() {return  SECOND; }
},
SECOND {
@Override
Order3 next() {return  THIRD; }
},
THIRD  {
@Override
Order3 next() {return  FIRST; }
};

abstract Order3 next();
}

/* enumeration
declare an enumeration
*/
void function1() {
var order = Order.FiRST;
}
void function2() {
Order order = Order.FiRST;
String y = "";
switch (order) {
  case FiRST: y = "one";
    break;
  case SECOND: y = "two";
    break;
  case THIRD: y = "three";
    break;
  default: y = "none";
}

}

void function3() {
Order2 order = Order2.FiRST;
var y = order.text;
}

void function4() {
Order3 order = Order3.FiRST;
var y = order.next();
}
}



}
