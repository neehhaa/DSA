package com.dsa.kunal;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }
    static boolean isPowerOfTwo(int n) {
        if(n > 2 && n % 2 == 1){
            return false;
        }
            n = n / 2;
            isPowerOfTwo(n);
            return true;

    }
}
