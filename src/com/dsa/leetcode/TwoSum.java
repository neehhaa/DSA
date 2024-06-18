package com.dsa.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 11, 4, 15};
        int target = 15;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> pre = new HashMap<>();
        ans[0] = -1;
        ans[1] = -1;

        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (!pre.containsKey(diff)) {
                pre.put(nums[i], i);
            } else {
                ans[0] = pre.get(diff);
                ans[1] = i;
            }
        }
        return ans;
    }
}
