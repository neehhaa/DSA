package com.dsa.leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {5, 9, 9, 9};
        int[] added = plusOne(digits);
        System.out.println(Arrays.toString(added));


    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] added = new int[n + 1];
        if (digits[n - 1] < 9) {
            digits[n - 1] = digits[n - 1] + 1;
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] >= 9) {
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }
                if (i == 0 && digits[i] == 0) {
                    added[0] = 1;
                    for (int j = 1; j < added.length; j++) {
                        added[j] = 0;
                    }
                    return added;

                }
            }
        }
        return digits;
    }
}
