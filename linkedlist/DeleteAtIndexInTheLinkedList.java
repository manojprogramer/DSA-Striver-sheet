package com.manoj.linkedlist;

public class DeleteAtIndexInTheLinkedList {
    public Node deleteAtIndexInTheLinkedList(Node head, int pos) {
        if(head == null) return head;
        else {
            if(pos == 1) {
                head = head.next;
                return head;
            }
            else {
                Node prev = head;
                Node temp = head;
                Node nextElement = head;
                for(int i = 1; i < pos; i++) {
                    prev = temp;
                    temp = temp.next;
                    nextElement = temp.next;
                }
                prev.next = nextElement;
            }
        }
        return head;
    }
}
