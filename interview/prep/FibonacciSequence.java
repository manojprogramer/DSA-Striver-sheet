package com.manoj.interview.prep;

public class FibonacciSequence {
    public int fibonacciNumber(int n) {
        int a = 0, b = 1;
        int c = a+b;
        for(int i = 0; i <= n; i++){
//            System.out.println(a);
            a = b;
            b = c;
            c = a+b;
        }
        return a;
    }

}
