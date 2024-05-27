package com.dsa.leetcode;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        reverse(n);

    }

    public static int reverse(int n) {
        long reverse = 0;
        while (n != 0) {
            int endDigit = n % 10;
            reverse = endDigit + (reverse * 10);
            n = n / 10;
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reverse;
    }
}
