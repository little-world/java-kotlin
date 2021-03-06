package courses;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {


/* array
an empty array
*/
void array() {
int[] seq = new int[2];

seq[0] = 1;
seq[1] = 2;

int y = seq[0];  //1

}


/* array
an array with values
*/
void array2() {
int[] seq = {1,2,3};
int y = seq[0];  //1
seq[1] = 4;
}

/* array loop
print 1234
*/
void array_loop() {
int[] seq = {1,2,3};

for (int i = 0; i < seq.length; i++) {
    System.out.print(seq[i]);
}

for (int x: seq) {
    System.out.print(x);
}
}

/* array list
an empty Lists
*/
void array_list() {
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
int y = list.get(0); //1
}

/* array list
a List with values
*/
void array_list2() {
List<Integer> list = Arrays.asList(1,2,3);

for (int x: list) {
    System.out.println(x);
}
}
}
