package com.dsa.searchingtechniques;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] search = new int[n];
        for (int i = 0; i < n-1; i++) {
            search[i] = input.nextInt();
        }
        int element = input.nextInt();
        int ls = Linear(search,element);
        System.out.println(ls);
    }

    public static int Linear(int[] search, int element){
        for (int i = 0; i < search.length; i++) {
            if (search[i] == element){
                return i;
            }
        }
        return -1;
    }
}
