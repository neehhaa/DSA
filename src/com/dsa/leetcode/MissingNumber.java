package com.dsa.leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 0};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        int sum = 0;
        int arraySum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            arraySum = arraySum + i + 1;
        }

        return arraySum - sum;
    }
}
