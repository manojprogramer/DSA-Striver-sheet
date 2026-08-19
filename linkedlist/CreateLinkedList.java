package com.manoj.linkedlist;

import java.util.Scanner;

public class CreateLinkedList {
    public void display(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of Elements");
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i++) {
//            System.out.println("Enter the element");
//            int data = sc.nextInt();
//            Node newNode = new Node(data);
//            if(head == null){
//                head = newNode;
//            }
//            else {
//                Node temp = head;
//                while(temp.next != null) {
//                    temp = temp.next;
//                }
//                temp.next = newNode;
//            }
//        }
        Node oneElement = new Node(10);
        head  = oneElement;
        Node twoElement = new Node(20);
        Node threeElement = new Node(30);
        Node fourElement = new Node(40);
        oneElement.next = twoElement;
        twoElement.next  = threeElement;
        threeElement.next = fourElement;
        CreateLinkedList c = new CreateLinkedList();
//        c.display(head);
//        InsertLinkedList i = new InsertLinkedList();
//        head = i.insertLinkedList(head);
//        c.display(head);
//        InsertAtIndexInTheLinkedList in = new InsertAtIndexInTheLinkedList();
//        head = in.insertAtIndexInTheLinkedList(head,5);
        InsertAtEndInTheLinkedList in = new InsertAtEndInTheLinkedList();
//        in.insertAtEndInTheLinkedList(head);
//        DeleteElementInLinkedList d = new DeleteElementInLinkedList();
//        head = d.deleteElementInLinkedList(head);
//        DeleteAtIndexInTheLinkedList d = new DeleteAtIndexInTheLinkedList();
//        head = d.deleteAtIndexInTheLinkedList(head,1);
        DeleteAtEndLinkedList d = new DeleteAtEndLinkedList();
        d.deleteAtEndLinkedList(head);
        c.display(head);
    }

}
