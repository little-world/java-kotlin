package courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {


    void array() {
        int[] seq = new int[2];
        seq[0] = 1;
        seq[1] = 2;
        int y = seq[0];  //1
        /// an empty array
    } //


    void array2() {
        int[] seq = {1,2,3,4};
        int y = seq[0];  //1
        seq[1] = 4;
        /// an array with values
    } //

    void array_loop() {
        int[] seq = {1,2,3,4};

        for (int i = 0; i < seq.length; i++) {
            System.out.print(seq[i]);
        }

        for (int x: seq) {
            System.out.print(x);
        }
        /// print: 1234
    } //

    void array_list() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        int y = list.get(0); //1
        /// an empty List
    } //


    void array_list2() {
        List<Integer> list = Arrays.asList(1,2,3,4);

        for (int x: list) {
            System.out.println(x);
        }
        /// a List with values
    } //
}
