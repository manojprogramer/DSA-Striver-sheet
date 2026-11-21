package com.manoj.interview.prep;

public class ArmstrongNumber {
    public int armstrongNumber(int n){
        int temp = n;
        int count = 0;
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum += (int) Math.pow(digit,count);
            n = n/10;
        }
        return sum;
    }
}
