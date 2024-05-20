package com.dsa.leetcode;

import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean sq = isPerfectSquare(n);
        System.out.println(sq);
    }

    public static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        while (start <= end){
            long mid = start + ((end - start)/2);

            if (mid * mid == num){
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
