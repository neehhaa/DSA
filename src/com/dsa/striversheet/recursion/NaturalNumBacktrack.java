package com.dsa.striversheet.recursion;

import java.util.Scanner;

public class NaturalNumBacktrack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        nNumbersBacktrack(n);
    }

    public static void nNumbersBacktrack(int n) {
        //base condition
        if (n < 1) {
            return;
        }
        nNumbersBacktrack(n - 1);
        System.out.println(n);
    }
}
