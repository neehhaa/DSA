package com.dsa.searchingtechniques;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] search = new int[n];
        for (int i = 0; i < n; i++) {
            search[i] = input.nextInt();
        }
        int element = input.nextInt();
        int bs = binary(search, element);
        System.out.println(bs);
    }

    public static int binary(int[] search, int element) {
        int startIndex = 0;
        int endIndex = search.length-1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + ((endIndex - startIndex) / 2);
            if (element > search[midIndex]) {
                startIndex = midIndex + 1;
            } else if (element < search[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}
