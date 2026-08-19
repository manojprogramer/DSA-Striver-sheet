package com.manoj.linkedlist;

public class InsertAtIndexInTheLinkedList {
    public Node insertAtIndexInTheLinkedList(Node head, int index){
        Node newNode = new Node(2000);
        if(head == null){
            head = newNode;
            return head;
        }
        else {
            if(index == 1){
                newNode.next = head;
                head = newNode;
                return head;
            }
            else {

                Node temp = head;
                Node prev = temp;
                for(int i = 1; i < index; i++) {
                    prev = temp;
                    temp = temp.next;
                }
                prev.next = newNode;
                newNode.next = temp;
            }

        }
        return head;
    }
}
