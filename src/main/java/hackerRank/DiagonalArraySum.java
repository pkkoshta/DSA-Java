package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DiagonalArraySum {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Creating inner lists
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(11);
        innerList1.add(2);
        innerList1.add(4);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);
        List<Integer> innerList3 = new ArrayList<>();
        innerList2.add(10);
        innerList2.add(8);
        innerList2.add(-12);

        // Adding inner lists to the outer list
        listOfLists.add(innerList1);
        listOfLists.add(innerList2);
        listOfLists.add(innerList3);

        diagonalDifference(listOfLists);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here\
        List<Integer> list = arr.stream().flatMap(List::stream).collect(Collectors.toList());
        int leftDigonal = 0;
        int rightDiagonal = 0;

        for(int i = 0; i < list.size(); i+=4){
            leftDigonal += list.get(i);
        }

        for(int i = 2; i <= list.size() - 2; i+=2){
            rightDiagonal += list.get(i);
        }
        System.out.println(leftDigonal - rightDiagonal);
        return leftDigonal - rightDiagonal;
    }


}
