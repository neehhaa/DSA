package com.dsa.leetcode;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sq = mySqrt(n);
        System.out.println(sq);
    }
    public static int mySqrt(int n) {

        long start = 1;
        long end = n;
        long ans = 0;
        while(start <= end){
            long mid = start + ((end - start)/2);
            if (mid * mid > n){
                end = mid - 1;
            } else if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
            }else {
                return (int) mid;
            }
        }
        return (int) ans;
    }
}
