package hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAvgMaxOf2DArray {
    public static void main(String[] args) {
        String[][] input1 = { {"Shubham", "55"}, {"Shivam", "68"}, {"Shubham", "97"}, {"Ritika", "97"} };
        String[][] input2 = { {"Karan", "55"}, {"Shivam", "68"}, {"Karan", "97"} };

        System.out.println(findHighestAverage(input1)); // Output: 97
        System.out.println(findHighestAverage(input2)); // Output: 76
    }

    public static int findHighestAverage(String[][] students) {
        Map<String, List<Integer>> studentMarks = Arrays.stream(students)
                .collect(Collectors.groupingBy(
                        student -> student[0],
                        Collectors.mapping(student -> Integer.parseInt(student[1]), Collectors.toList())
                ));

        return studentMarks.values().stream()
                .mapToInt(marks -> (int) marks.stream().mapToInt(Integer::intValue).average().orElse(0))
                .max()
                .orElse(0);
    }
}
