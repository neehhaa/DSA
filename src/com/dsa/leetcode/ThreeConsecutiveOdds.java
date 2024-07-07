package com.dsa.leetcode;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,9,11,12,14};

        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            int k = i+2;
            if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[k] % 2 != 0){
                System.out.println(true);
            }
        }
    }
}
