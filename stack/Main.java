package com.manoj.stack;

public class Main {
    public static void main(String[] args) {
        StackImplementation s = new StackImplementation(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.push(40);
        s.printStack();
        s.pop();
        s.printStack();
        System.out.println(s.size());;
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}
