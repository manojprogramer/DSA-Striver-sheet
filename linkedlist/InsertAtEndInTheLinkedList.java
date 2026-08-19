package com.manoj.linkedlist;

public class InsertAtEndInTheLinkedList {
    public void insertAtEndInTheLinkedList(Node head) {
        Node newNode = new Node(3000);
        if(head == null) {
            head = newNode;
        }
        else{
            Node temp = head;
            Node prev = head;
            while (temp != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = newNode;
        }
    }
}
