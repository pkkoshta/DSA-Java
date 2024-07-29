package hackerRank;

import java.util.Arrays;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int[] ar = {2,3,0,3, 4, 0}; // 2,3,0,3, 4, 0
        int left = 0, right = 0;  // 1, 2
        while (right < ar.length){
              if (ar[right] != 0){
                  int temp = ar[right];
                  ar[right] = ar[left];
                  ar[left] = temp;
                  right++;
                  left++;
              }else {
                  right++;
              }
        }
        Arrays.stream(ar).forEach(System.out::println);
    }
}
