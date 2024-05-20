package com.dsa.leetcode;

import java.util.Scanner;

public class FixedPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int ans = fixedPoint(arr);
        System.out.println(ans);
    }

    public static int fixedPoint(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == mid){
               ans = mid;
                end = mid -1;
            }
            else if (arr[mid] > mid){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}