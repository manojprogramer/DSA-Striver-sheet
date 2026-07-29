package com.manoj;

public class Gcd {
    public static void gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(a);
    }
}
