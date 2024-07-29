package hackerRank;

public class FindTheMaxSumOfSubArray {
    public static void main(String[] args) {
//        findMaxLengthOfSubString("cbffffff");
        int[] arr = {1,2,3,5,8};
        int target = 10;
        System.out.println(findMinSubArray(arr, target));
     }

     public static void findMaxLengthOfSubString(String str){
        if (str.length() == 0) {
            System.out.println(0);
            return;
        }
        int l = 0;
        int r = 1;
        int maxLength = 1;
        while ( r < str.length()){
            if (str.charAt(l) == str.charAt(r)) {
                r++;
            }
            else {
                maxLength = Math.max((r-l) , maxLength);
                l = r;
                r = l +1;
            }
        }
         System.out.println(Math.max(maxLength, (r-l)));
         System.out.print("Start :" + l + " " + " end : " +( r-1));
    }

    public static double findMinSubArray(int[] arr, int target){
        int left = 0, right = 0, sum = 0;
        double min = (Math.pow(2, 32))-1;
        while (right < arr.length){
            sum += arr[right];
            if (sum >= target){
                min = Math.min(min, (right - left)+1);
                while (left < right) {
                    sum -= arr[left];
                    left++;
                    if (sum >= target) {
                        min = Math.min(min, (right - left)+1);
                    }
                    else {
                        right++;
                        break;
                    }
                }
            }else {
                right++;
            }
        }
        if (min == Math.pow(2,32) - 1) return 0;
        return min;
    }

}
