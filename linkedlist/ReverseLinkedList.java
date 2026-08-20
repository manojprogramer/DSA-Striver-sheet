package com.manoj.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {
    public Node reverseLinkedListBruteForceApproach(Node head) {
        if(head == null) return  null;
        Node temp = head;
        Stack<Integer> s = new Stack<>();
        while(temp != null) {
            s.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {
            temp.data = s.pop();
            temp = temp.next;
        }
        return head;
    }
    public Node reverseLinkedListOptimalApproach(Node head) {
        if(head == null) return null;
        Node prev = null;
        Node temp = head;
        Node front = head;
        while(front != null) {
            front = front.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public Node recursiveSolution(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = recursiveSolution(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
