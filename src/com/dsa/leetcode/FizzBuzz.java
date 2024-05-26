package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        List<String> arr = fizzBuzz(n);
        System.out.println(arr);
    }
    public static List<String> fizzBuzz(int n) {

        ArrayList<String> arr = new ArrayList<>(n);

        for(int i=1; i<=n; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else  if (i % 3 == 0){
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            }else {
                arr.add(String.valueOf(i));
            }
        }

        return arr;
    }

}