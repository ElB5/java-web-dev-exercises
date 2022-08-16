package exercises.ch3ControlFlowAndCollections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

//        int[] intArray = {1, 1, 2, 3, 5, 8};
//        Loop through the array and print out each value,
//        for (int i : intArray) {
//            System.out.println(i);
//        }
//        then modify the loop to only print the odd numbers.
//        for (int i = 0; i <= intArray.length; i++) {
//            if (intArray[i] % 2 != 0) {
//                System.out.println(intArray[i]);
//            }
//        }
//split string into array at each space:
//        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. " +
//                "I will not eat them with a mouse.";
//        String[] strArr = str.split(" ");
//
//        System.out.println(Arrays.toString(strArr));

        //split string into array at each sentence:
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] strArr = str.split("\\.");

        System.out.println(Arrays.toString(strArr));

    }
};
