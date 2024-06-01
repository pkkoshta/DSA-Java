package org.dsa;


public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {11,12,13,14,15,16,17};
        int target = 15;
        int result  = binarySearch(array, target);
        System.out.println("element found in index --> " + result);
    }
    public static int binarySearch(int[] item, int target){
        int left = 0;
        int right = item.length-1;



        while (left <= right){

            int mid = (left + right)/2;
            if (item[mid] == target) {
                return mid;
            }
            if (item[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return -1;
    }
}
