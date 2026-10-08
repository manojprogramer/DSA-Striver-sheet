package com.manoj.stack;

public class StackImplementation {
    int[] arr;
    int top = -1;
    int capacity = 0;
    public StackImplementation(int size){
        this.arr = new int[size];
        this.capacity = size;
    }
    public void push(int value){
        if(top == capacity) System.out.println("Stack Overflow");
        top++;
        capacity++;
        arr[top] = value;
    }
    public int pop(){
        if(top == -1) System.out.println("Stack UnderFlow");
        return arr[top--];
    }
    public boolean isEmpty(){
        if(top == -1) return true;
        else return false;
    }
    public int peek(){
        return arr[top];
    }
    public int size(){
        return top+1;
    }
    public void printStack(){
        for(int i = 0; i < size(); i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
    }
}
