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
    public void display2(Node head){
        while(head != null){
            Node temp = head;
            while(temp != null) {
                System.out.println(temp.data);
                System.out.println("|");
                temp = temp.child;
            }
            System.out.println("null");
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
        Node oneElement = new Node(1);
        head  = oneElement;
        Node twoElement = new Node(2);
        Node threeElement = new Node(3);
        Node fourElement = new Node(4);
        Node fifthElement = new Node(5);
//        Node sixthElement = new Node(1);
        oneElement.next = twoElement;
        twoElement.next  = threeElement;
        threeElement.next = fourElement;
        fourElement.next = fifthElement;
//        fifthElement.next = sixthElement;
//        sixthElement.next = threeElement;

        oneElement.child = null;
        twoElement.child = oneElement;
        threeElement.child = fifthElement;
        fourElement.child = threeElement;
        fifthElement.child = oneElement;
//        oneElement.child = null;
//
//        Node twoChildElement = new Node(10);
//        Node twoChildElement2 = new Node(11);
//        twoElement.child = twoChildElement;
//        twoChildElement.child = twoChildElement2;
//
//
//        Node threeChildElement = new Node(7);
//        Node threeChildElement2 = new Node(11);
//        Node threeChildElement3 = new Node(12);
//        threeElement.child = threeChildElement;
//        threeChildElement.child = threeChildElement2;
//        threeChildElement2.child = threeChildElement3;
//
//        fourElement.child = new Node(9);
//
//        Node fifthChildElement = new Node(6);
//        Node fifthChildElement2 = new Node(8);
//        fifthElement.child = fifthChildElement;
//        fifthChildElement.child = fifthChildElement2;

        Node head2 = null;
        Node oneElement1 = new Node(7);
        head2  = oneElement1;
        Node twoElement1 = new Node(8);
        Node threeElement1 = new Node(9);
        Node fourElement1 = new Node(4);
        Node fifthElement1= new Node(5);
        Node sixthElement1 = new Node(6);
        oneElement1.next = twoElement1;
        twoElement1.next  = threeElement1;
        threeElement1.next = fourElement1;
        fourElement1.next = fifthElement1;
        fifthElement1.next = sixthElement1;


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
//        DeleteNodeInAListO1Complexity d = new DeleteNodeInAListO1Complexity();
//        d.deleteNodeInAListO1Complexity(head.next.next.next.next.next);
//        FindTheIntersectionPointOfLL f  = new FindTheIntersectionPointOfLL();
//        head = f.findTheIntersectionPointOfLLBruteForceApproach(head,head2);
//        head = f.findTheIntersectionPointOfLLBetterApproach(head,head2);
//        head = f.findIntersectionPointOfLLOptimalApproach(head,head2);
//        DetectALoopInLL d = new DetectALoopInLL();
//        System.out.println(d.detectALoopInLLBruteForceApproach(head));
//        System.out.println(d.detectALoopInLLOptimalApproach(head));
//        ReverseLLInGroupOfK r = new ReverseLLInGroupOfK();
//        head = r.reverseLLInGroupOfK(head,3);
//        CheckIfLLIsPalindromeOrNot p = new CheckIfLLIsPalindromeOrNot();
//        System.out.println(p.checkIfLLIsPalindromeOrNotBruteForceApproach(head));
//        System.out.println(p.checkIfLLIsPalindromeOrNotOptimalApproach(head));
//        FindTheStartingPointInLL f = new FindTheStartingPointInLL();
//        head = f.findTheStartingPointInLLBruteForceApproach(head);
//        head = f.findTheStartingPointInLLOptimalApproach(head);
//        System.out.println(head.data);
//        FlatteningOfLL f = new FlatteningOfLL();
//        head = f.flatteningOfLLBruteForceApproach(head);
//        head = f.flatteningOfLLOptimalApproach(head);
//        RotateLL r = new RotateLL();
//        head = r.rotateLL(head,2);
        CloneLLWithRandomAndNextPointer cr = new CloneLLWithRandomAndNextPointer();
//        Node head1 = cr.cloneWithRandomAndNextPointer(head);
        head = cr.cloneWithRandomAndNextPointerOptimalApproach(head);
        c.display(head);
//        c.display2(head);
    }

}
