package org.dsa.array;

public class CustomArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int size = arr.length;
        int[] arr2 = resizeArray(arr, size);
        System.out.println("initial size " + size);
        System.out.println("new size " + arr2.length);

    }

    private static int[] resizeArray(int[] arr, int size) {
        int[] tempArr = new int[size * 2];
        for (int i = 0; i < size; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        return arr;
    }

}
