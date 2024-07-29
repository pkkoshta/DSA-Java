package org.dsa.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,0,8};
        findMinElement(array);
        findSecoundLargestElement(array);
    }

    private static void findSecoundLargestElement(int[] array) {
        OptionalInt first = Arrays.stream(array).max().stream().skip(1).findFirst();
        System.out.println(first.getAsInt());
    }

    private static void findMinElement(int[] array) {
        int min = array[1];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }


}
