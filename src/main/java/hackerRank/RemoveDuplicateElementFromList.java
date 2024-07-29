package hackerRank;

import java.util.*;

public class RemoveDuplicateElementFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 3, 5);
        List<Integer> duplicateElements = new ArrayList<>();
        Set<Integer> unique = new HashSet<>();

        list.stream().forEach(e-> {
            if (!unique.contains(e)) {
                unique.add(e);
            }else {
                duplicateElements.add(e);
            }
        });

        duplicateElements.forEach(System.out::println);
    }
}
