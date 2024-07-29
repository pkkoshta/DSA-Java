package hackerRank;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5);

       OptionalInt maxnumber = list.stream().mapToInt(Integer::intValue).max();
       int numberOfCandles= (int) list.stream().filter(e -> maxnumber.getAsInt() == e).count();
        System.out.printf("number of candles "+ numberOfCandles);
    }
}
