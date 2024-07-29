package leetCode;

public class TrapingWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(findMaxWater(height));
    }

    public static int findMaxWater(int[] height){
        int maxWater = 0 ;
        int size = height.length;
        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = height[0];
        for (int i = 1; i < size; i++) {
            left[i] = Math.max(height[i - 1], height[i]);
        }

        right[size -1] = height[size-1];
        for (int i = size-2; i >= 0 ; i--) {
            right[i] = Math.max(height[i+1], height[i]);
        }

        for (int i = 0; i < size; i++) {
            maxWater = Math.min(left[i], right[i]) - height[i];
        }
        return maxWater;
    }
}
