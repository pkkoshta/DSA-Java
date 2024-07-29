package hackerRank;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FIndDecimalVaueFromArrary {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        int size = arr.size();
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeros = 0;
        for (Integer e : arr) {
            if (e < 0){
                negativeNumber++;
            }
            else if (e > 0) {
                positiveNumber++;
            }else zeros++;
        }

        double positive = (double) positiveNumber/size;
        double negative = (double) negativeNumber/size;
        double zero  = (double) zeros/size;
        System.out.printf("%.6f\n", positive);
        System.out.printf("%.6f\n", negative);
        System.out.printf("%.6f\n", zero);
    }

}
