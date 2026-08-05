package com.manoj.arrays;

public class Power {
    public void power(double num, int n) {
        double sol = 1;
        int nn  = n;
        if(n < 0)
            nn = -1*n;
       for(int i = 0; i < nn; i++) {
           sol *= num;
       }
       if(n < 0) sol = 1.0/sol;
       sol = Math.round(sol*10000.0)/10000.0;
        System.out.println(sol);
    }

    public static void main(String[] args) {
        Power  p = new Power();
        p.power(2.0000,-2);
    }
}
