package org.dsa.array;

public class PellendromString {
    public static void main(String[] args) {
        String s = "SATAS";
        boolean result = pallendromString(s);
        System.out.println(result);
    }

    private static boolean pallendromString(String s) {
        int start = 0;
        int end = s.length() -1;
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
