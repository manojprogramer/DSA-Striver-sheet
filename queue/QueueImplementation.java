package com.manoj.queue;

public class QueueImplementation {
    int rear;
    int front;
    int capacity;
    int[] arr;
    int size;
    public QueueImplementation(int size) {
        this.rear = 0;
        this.front = 0;
        this.size = 0;
        this.capacity = size;
        this.arr = new int[size];
    }
    public void enqueue(int value){
        if(size == capacity) {
            System.out.println("Queue is Full");
            return;
        }
        arr[rear] = value;
        rear = (rear+1)%capacity;
        size++;
    }
    public int dequeue(){
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = arr[front];
        front = (front+1)%capacity;
        size--;
        return value;
    }
    public int size(){
        return size;
    }
    public int peek(){
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
