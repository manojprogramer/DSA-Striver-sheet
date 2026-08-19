package com.manoj.linkedlist;

public class DeleteAtEndLinkedList {
    public void deleteAtEndLinkedList(Node head){
        Node temp = head;
        Node prev = head;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
}
