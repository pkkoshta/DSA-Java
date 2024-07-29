package hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMaxSumOfArrary {
    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(140638725, 436257910, 953274816, 734065819, 362748590));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long maxSum = arr.stream().skip(1)
                .mapToLong(Integer::longValue)
                .sum();
        long minSum = arr.stream().limit(arr.size()-1)
                .mapToLong(Integer::longValue).sum();

        System.out.print(minSum);
        System.out.print(" ");
        System.out.print(maxSum);


    }

}

