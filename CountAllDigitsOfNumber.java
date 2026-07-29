package com.manoj;

public class CountAllDigitsOfNumber {
    public static void countAllDigitsOfNumber(int n) {
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
