package hackerRank;

import java.util.*;

public class DuplicateValuesInArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
              //  return true;
            }
        }
    }
}
