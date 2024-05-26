package com.dsa.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int target = input.nextInt();;
        int[] ans = findRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findRange(int[] arr,int target){
        int[] range = new int[2];
        int low = lowRange(arr,target);
        int high = highRange(arr,target);
        range[0] = low;
        range[1] = high;
        return range;
    }
    public static int lowRange(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int low = -1;

        while (start <= end){
            int mid = start + ((end - start)/2);
            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
                low = mid;
            }
        }
        return low;
    }
    public static int highRange(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int high = -1;

        while (start <= end){
            int mid = start + ((end - start)/2);
            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                start = mid + 1;
                high = mid;
            }
        }
        return high;
    }
}