package org.dsa;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,9,5,7};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                //System.out.println("sorted elements are :");

            }
            System.out.print(arr[i]);
        }
    }
}
