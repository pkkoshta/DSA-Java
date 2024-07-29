package org.dsa.array;

import java.util.Arrays;

public class RemoveEvenElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] oddElemetn = removeEvenElement(array);
        Arrays.stream(oddElemetn).forEach(System.out::println);
    }

    private static int[] removeEvenElement(int[] array) {
        int size = array.length;
        int oddElement = 0;
        for(int  i = 0; i < size; i++){
            if (array[i] % 2 != 0){
                oddElement++;
            }
        }
//        create a new array to hold odd number
        int idx = 0;
        int[] oddArray = new int[oddElement];
        for (int i = 0; i < size; i++){
            if (array[i] %2 != 0){
                oddArray[idx] = array[i];
                idx++;
            }
        }
        return oddArray;
    }
}
