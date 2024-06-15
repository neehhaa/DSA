package com.dsa.leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, -1, 2, 4, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int unpaired = 0;
        for (int num : nums) {
            unpaired = unpaired ^ num;
        }
        return unpaired;
    }
}
