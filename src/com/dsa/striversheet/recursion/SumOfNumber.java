package com.dsa.striversheet.recursion;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumNumber(n));
    }

    public static int sumNumber(int n) {
        if (n == 0) {
            return n;
        }
        return n + sumNumber(n - 1);
    }
}
