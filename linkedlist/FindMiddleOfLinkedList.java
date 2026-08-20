package com.manoj.linkedlist;

public class FindMiddleOfLinkedList {
    public Node findMiddleOfLinkedList(Node head) {
        if(head == null) return null;
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int mid = (count/2)+1;
        Node prev = head;
        temp = head;
        for(int i = 1; i <= mid; i++){
            prev = temp;
            temp = temp.next;
        }
        return prev;
    }
}
