package com.manoj.linkedlist;

import java.util.Scanner;

public class CreateLinkedList {
    public void display(Node head) {
        while(head != null) {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.println("null");
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
        Node oneElement = new Node(1);
        head  = oneElement;
        Node twoElement = new Node(2);
        Node threeElement = new Node(3);
        Node fourElement = new Node(4);
        Node fifthElement = new Node(5);
        Node sixthElement = new Node(6);
        oneElement.next = twoElement;
        twoElement.next  = threeElement;
        threeElement.next = fourElement;
        fourElement.next = fifthElement;
        fifthElement.next = sixthElement;

        Node head2 = null;
        Node oneElement1 = new Node(4);
        head2  = oneElement1;
        Node twoElement1 = new Node(5);
        Node threeElement1 = new Node(6);
//        Node fourElement1 = new Node(3);
//        Node fifthElement1= new Node(3);
//        Node sixthElement1 = new Node(10);
        oneElement1.next = twoElement1;
        twoElement1.next  = threeElement1;
//        threeElement1.next = fourElement1;
//        fourElement1.next = fifthElement1;
//        fifthElement1.next = sixthElement1;


        CreateLinkedList c = new CreateLinkedList();
//        c.display(head);
//        InsertLinkedList i = new InsertLinkedList();
//        head = i.insertLinkedList(head);
//        c.display(head);
//        InsertAtIndexInTheLinkedList in = new InsertAtIndexInTheLinkedList();
//        head = in.insertAtIndexInTheLinkedList(head,5);
//        InsertAtEndInTheLinkedList in = new InsertAtEndInTheLinkedList();
//        in.insertAtEndInTheLinkedList(head);
//        DeleteElementInLinkedList d = new DeleteElementInLinkedList();
//        head = d.deleteElementInLinkedList(head);
//        DeleteAtIndexInTheLinkedList d = new DeleteAtIndexInTheLinkedList();
//        head = d.deleteAtIndexInTheLinkedList(head,1);
//        DeleteAtEndLinkedList d = new DeleteAtEndLinkedList();
//        d.deleteAtEndLinkedList(head);
//        FindMiddleOfLinkedList f = new FindMiddleOfLinkedList();
//        Node value = f.findMiddleOfLinkedList(head);
//        System.out.println("Output: "+value.data);
//        ReverseLinkedList r = new ReverseLinkedList();
//        head = r.reverseLinkedListBruteForceApproach(head);
//        head = r.reverseLinkedListOptimalApproach(head);
//        head = r.recursiveSolution(head);
//        MergeTwoSortedLists m = new MergeTwoSortedLists();
//        head = m.mergeTwoSortedListsBruteForceApproach(head,head2);
//        head = m.mergeTwoSortedListsOptimalApproach(head,head2);
//        RemoveNthNodeFromTheBackOfLinkedList r = new RemoveNthNodeFromTheBackOfLinkedList();
//        c.display(head);
//        head = r.removeNthNodeFromTheBackOfLinkedListBruteForceApproach(head,1);
//        head = r.removeNthNodeFromTheBackOfLinkedListOptimalApproach(head,6);
//        AddTwoNumbersInLinkedList a = new AddTwoNumbersInLinkedList();
//        head =  a.addTwoNumbersInLinkedList(head,head2);
        DeleteNodeInAListO1Complexity d = new DeleteNodeInAListO1Complexity();
        d.deleteNodeInAListO1Complexity(head.next.next.next.next.next);
        c.display(head);


    }

}
