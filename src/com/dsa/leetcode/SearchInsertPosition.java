package com.dsa.leetcode;

import java.util.Scanner;

public interface SearchInsertPosition {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] sortedArr = new int[n];
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = input.nextInt();
        }
        int element = input.nextInt();

        int targetIndex = binarySearch(sortedArr,element);
        System.out.println(targetIndex);

    }

    static int binarySearch(int[] sortedArr, int element){
        int startIndex = 0;
        int endIndex = sortedArr.length - 1;

        while(startIndex <= endIndex){
            int mid = (startIndex + (endIndex - startIndex)/2);
            if (element > sortedArr[mid]){
                startIndex = mid + 1;
            } else if (element <sortedArr[mid]) {
                endIndex = mid - 1;
            }else {
                return mid;
            }
        }
        return endIndex+1;

    }
}
