package com.manoj;

public class Patterns {
    public void pattern17(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            int condition = (2*i-1);
//            int temp = 2;
            int sol = 65;
            int mid = condition/2+2;
            for(int k = 1; k <= condition; k++) {
                if(k >= mid) {
                    sol -= 2;
                }
                System.out.print((char) sol);
                sol++;
            }
            System.out.println();
        }
    }
    public void pattern18(int n) {
        for(int i = 0; i < n; i++) {
            int temp = 64+n-i;
            for(int j = 0; j <= i; j++) {
                System.out.print((char) temp++);
            }
            System.out.println();
        }
    }
    public void pattern19(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < 2*i; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l < n-i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 0; i--) {
            for(int j = n-1-i; j >= 0; j--) {
                System.out.print("*");
            }
            for(int k = 0; k < 2*i; k++) {
                System.out.print(" ");
            }
            for(int l = n-1-i; l >= 0; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern20(int n) {
        int temp = 2;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < 2*n-temp; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l <= i; l++)
                System.out.print("*");
            temp += 2;
            System.out.println();
        }
        temp -= 4;
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < 2*n-temp; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l < i; l++)
                System.out.print("*");
            temp -= 2;
            System.out.println();
        }
    }
    public void pattern21(int n) {
        for(int i = 0; i < 2*n-1; i++) {
            if(i == 0 || i == n-1) {
                for(int j =1; j <= 2*n-1; j++)
                    System.out.print(n+" ");
                System.out.println();
            }
            else {
                System.out.print(n+" ");
                for(int k = 0; k < 2*n-3; k++) {
                    System.out.print(n-i+" ");
                }
                System.out.println(n+" ");
            }

        }
    }
    public void pattern22(int n) {
        int temp = 2;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(n-j+" ");
            }
            for(int k = 0; k <2*n-1-temp; k++){
                System.out.print(n-i+" ");
            }
            int m = 0;
            if(i == n-1) m++;
            for(int l = m; l <= i; l++)
            {
                System.out.print(n-i+l+" ");
            }
            temp += 2;
            System.out.println();
        }
        temp -= 4;
        for(int i = n-2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                System.out.print(n-j+" ");
            }
            for(int k = 0; k <2*n-1-temp; k++){
                System.out.print(n-i+" ");
            }
            int m = 0;
            if(i == n-1) m++;
            for(int l = m; l <= i; l++)
            {
                System.out.print(n-i+l+" ");
            }
            temp -= 2;
            System.out.println();
        }
    }
}
