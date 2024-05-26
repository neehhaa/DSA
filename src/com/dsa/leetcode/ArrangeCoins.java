package com.dsa.leetcode;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            n = n - i;
            count = count + 1;
        }
        System.out.println(count);
    }
}
