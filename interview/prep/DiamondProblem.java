package com.manoj.interview.prep;

interface A {
    default void fun(){    // default method conflict
        System.out.println("This is A interface method");
    }
    void fun2(); // Conflict Resolution

}
interface B{
    default void fun(){
        System.out.println("This is B interface method");
    }
    void fun2();
}
public class DiamondProblem implements B,A{

    public static void main(String[] args) {
        DiamondProblem  d= new DiamondProblem();
        d.fun();
    }
    @Override
    public void fun(){
        A.super.fun();
    }

    @Override
    public void fun2() {


    }

}
