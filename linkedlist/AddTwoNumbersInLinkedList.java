package com.manoj.linkedlist;

public class AddTwoNumbersInLinkedList {
    public Node addTwoNumbersInLinkedList(Node head1, Node head2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry = 0;
        int sum = 0;
        while(head1 != null || head2 != null){
            sum = 0;
            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            sum = sum+carry;
            carry = sum/10;
            int value = sum%10;

            Node newNode = new Node(value);
            temp.next = newNode;
            temp = newNode;
        }
        return dummyNode.next;

    }
}
