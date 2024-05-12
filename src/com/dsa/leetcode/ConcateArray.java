package com.dsa.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ConcateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(concate(nums)));
    }

    public static int[] concate(int[] nums){
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }


        return ans;
    }
}
