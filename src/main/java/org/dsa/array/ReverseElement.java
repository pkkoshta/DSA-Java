package org.dsa.array;

public class ReverseElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
         reverseArray(array);
    }

    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
