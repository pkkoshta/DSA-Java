package leetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsertPosition(arr, target));
    }

    public static int searchInsertPosition(int[] arr, int target){
//        will use binary search to solve this question.
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] <= target){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return start;
    }
}
