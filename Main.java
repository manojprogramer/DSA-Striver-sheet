package com.manoj;

public class Main{

    public static void main(String[] args) throws InterruptedException {
        StringBuilder s = new StringBuilder("manoj");
        StringBuilder str = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            str.append(s.charAt(i));
        }
        System.out.println(str);
    }
}


