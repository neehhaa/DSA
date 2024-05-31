package com.dsa.striversheet.recursion;

import java.util.Scanner;

public class NumbersNTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        printNumber(1, n);

    }

    public static void printNumber(int i, int n) {
        if (i == n + 1) {
            return;
        }
        System.out.println(i);
        i++;
        printNumber(i, n);
    }
}
