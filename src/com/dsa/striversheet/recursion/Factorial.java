package com.dsa.striversheet.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if (n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }
}
