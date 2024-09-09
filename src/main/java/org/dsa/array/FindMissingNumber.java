package org.dsa.array;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3, 4,5,6, 8};
        int size = arr.length;
        int missingNumber = findMissingNumber(arr, size);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int[] arr, int size) {
        int sumVal = size +1 ;
        int totalNumber;
        totalNumber = sumVal*(sumVal + 1)/2;
        for (int i = 0; i < size; i++) {
            totalNumber  -= arr[i];
        }
        return totalNumber;
    }


}
