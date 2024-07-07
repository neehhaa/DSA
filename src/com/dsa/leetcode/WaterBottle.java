package com.dsa.leetcode;

public class WaterBottle {
    public static void main(String[] args) {
        int numBottles = 5;
        int numExchange = 5;
        int drank = numBottles;
        while (numBottles >=  numExchange){
            int remainingEmpty = numBottles % numExchange;
            numBottles = numBottles / numExchange;
            drank = drank + numBottles;
            numBottles = numBottles+remainingEmpty;
            System.out.println(drank);
        }
    }
}
