package com.manoj.interview.prep;

interface A {
    static void fun(){
        System.out.println("This method is belongs to A");

    }
}
interface B{
   default void fun(){
        System.out.println("This method is belongs to B");
    }
}
public class DiamondProblem implements B,A{
    @Override
    public void fun(){
        B.super.fun();

    }

    public static void main(String[] args) {
        DiamondProblem d = new DiamondProblem();
        d.fun();
    }
}
