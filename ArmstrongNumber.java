package com.manoj;

public class ArmstrongNumber {
    public static void armstrongNumber(int num) {
        int key = num;
        int digits = String.valueOf(num).length();
        System.out.println(digits);
        double sum = 0;
        while(num > 0) {
            int d = num%10;
            sum =  sum+Math.pow(d,digits);
            num /= 10;
        }
        System.out.println((int)sum);
    }
}
