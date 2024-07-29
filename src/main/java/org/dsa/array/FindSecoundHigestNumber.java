package org.dsa.array;

public class FindSecoundHigestNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6, 11,7,8,6,9,10};
        int secoundHighestElement = secoundHighestElement(array);
        System.out.println(secoundHighestElement);
    }

    private static int secoundHighestElement(int[] array) {
        int max = Integer.MIN_VALUE;
        int secoundHigh = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                secoundHigh = max;
                max = array[i];
            }
            else if (secoundHigh < array[i] && max != array[i])   {
                secoundHigh = array[i];
            }
        }
        if (secoundHigh < max){
            return secoundHigh;
        }
        return secoundHigh;
    }

}
