package com.manoj.interview.prep;

public class GcdOfTwoNumbers {
    public int gcdOfTwoNumberBruteForceApproach(int a, int b){
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; i++){
            if(a%i == 0 && b % i == 0)
                gcd = i;

        }
        return gcd;
    }
    public int gcdOfTwoNumbersOptimalApproach(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;

    }
}
