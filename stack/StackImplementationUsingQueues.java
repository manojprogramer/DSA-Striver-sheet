package com.manoj.stack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackImplementationUsingQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public StackImplementationUsingQueues(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int value){
        queue2.offer(value);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    public int pop(){
        if(queue1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue1.poll();

    }
    public boolean isEmpty(){
        return queue1.isEmpty();
    }
    public int peek(){
        return (queue1.peek() == null) ? -1: queue1.peek();
    }
}
