package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i : grades) {
            result.add(checkMultipleOfFive(i));
        }
        return result;
    }

    public static int checkMultipleOfFive(int gradeNumber){
        if (gradeNumber >= 38){
            if (gradeNumber % 5 >= 3){
                gradeNumber+= 5 - (gradeNumber % 5);
            }
        }
        return gradeNumber;
    }

    public static void main(String[] args) {
        List<Integer> integers = gradingStudents(Arrays.asList(23, 80, 96, 18, 73, 78));
        integers.forEach(System.out::println);
    }
}
