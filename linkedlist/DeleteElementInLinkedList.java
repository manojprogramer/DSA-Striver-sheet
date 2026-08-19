package com.manoj.linkedlist;

public class DeleteElementInLinkedList {
    public Node deleteElementInLinkedList(Node head) {
        if(head == null) return head;
        else {
            head = head.next;
            return head;
        }
    }
}
