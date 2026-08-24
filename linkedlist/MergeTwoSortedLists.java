package com.manoj.linkedlist;

import com.sun.source.tree.Tree;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class MergeTwoSortedLists {
    public Node mergeTwoSortedListsBruteForceApproach(Node head1, Node head2){
       Node dummyHead = null;
       Node temp = null;
       while(head1 != null && head2 != null){
           if(head1.data < head2.data){
               Node newNode = new Node(head1.data);
               if(dummyHead == null) dummyHead = newNode;
               if(temp == null) temp = newNode;
               else {
                   temp.next = newNode;
                   temp = newNode;
               }
               head1 = head1.next;
           }
           else{
               Node newNode = new Node(head2.data);
               if(dummyHead == null) dummyHead = newNode;
               if(temp == null) temp = newNode;
               else {
                   temp.next = newNode;
                   temp = newNode;
               }
               head2 = head2.next;
           }
       }
       if(head1 != null && temp != null) temp.next = head1;
       if(head2 != null && temp != null) temp.next = head2;
       return dummyHead;
    }
    public Node mergeTwoSortedListsOptimalApproach(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        while(head1 != null && head2 != null) {
            if(head1.data < head2.data){
                temp.next = head1;
                temp = head1;
                head1 = head1.next;
            }
            else {
                temp.next = head2;
                temp = head2;
                head2 = head2.next;
            }
        }
        if(head1 != null) temp.next = head1;
        if(head2 != null) temp.next = head2;
        return dummyHead.next;

    }
}
