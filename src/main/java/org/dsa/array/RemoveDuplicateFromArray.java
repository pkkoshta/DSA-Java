package org.dsa.array;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,2,6,3,6,4};
        int [] result =  removeDuplicate(arr);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] removeDuplicate(int[] arr) {
        int size = arr.length;
        int duplicateEle = 0;
        for (int  i = 0; i < size; i++){
            for (int j = i +1; j < size; j++){
                if (arr[i] == arr[j]){
                    duplicateEle++;
                }
            }
        }
        int uniqueEleSize = size - duplicateEle;
        int[] uniqueElement = new int[uniqueEleSize];
        for (int  i = 0; i < size; i++){
            for (int j = i +1; j < size; j++){
                if (arr[i] != arr[j]){
                  uniqueElement[i] = arr[i];

                }
            }
        }
        return uniqueElement;
    }
}
