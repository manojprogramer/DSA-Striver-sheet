package com.manoj.linkedlist;
public class InsertLinkedList {
   public Node insertLinkedList(Node head) {
        Node temp = head;
        Node newNode = new Node(1000);
        newNode.next = head;
        head = newNode;
        return head;
   }
}
