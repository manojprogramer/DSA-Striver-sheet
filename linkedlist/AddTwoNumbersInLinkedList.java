package com.manoj.linkedlist;

public class AddTwoNumbersInLinkedList {
    public void addTwoNumbersInLinkedList(Node head1, Node head2){
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        Node temp = head1;
        while(temp != null) {
            first.append(temp.data);
            temp = temp.next;
        }
        temp = head2;
        while(temp != null) {
            second.append(temp.data);
            temp = temp.next;
        }
        first.reverse();
        second.reverse();
        int sol = Integer.parseInt(String.valueOf(first))+Integer.parseInt(String.valueOf(second));
        System.out.println(sol);

    }
}
