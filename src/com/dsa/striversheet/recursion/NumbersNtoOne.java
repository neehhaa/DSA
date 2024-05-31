package com.dsa.striversheet.recursion;

import java.util.Scanner;

public class NumbersNtoOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        printNumber(n);

    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        n--;
        printNumber(n);
    }
}
