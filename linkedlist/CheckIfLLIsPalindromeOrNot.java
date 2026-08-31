package com.manoj.linkedlist;

import java.util.Stack;

public class CheckIfLLIsPalindromeOrNot {
    public boolean checkIfLLIsPalindromeOrNotBruteForceApproach(Node head){
        Stack<Integer>s = new Stack<>();
        Node temp = head;
        while(temp != null) {
            s.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null && !s.isEmpty()) {
            int val = s.pop();
            if(temp.data != val)
                return false;
            temp = temp.next;
        }
        return true;
    }
    public boolean checkIfLLIsPalindromeOrNotOptimalApproach(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseLL(slow.next);
        slow = head;
        fast = newHead;
        while(fast != null){
            if(slow.data != fast.data) return false;
            fast = fast.next;
            slow = slow.next;
        }
        reverseLL(newHead);
        return true;
    }

    public Node reverseLL(Node head) {
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
}
