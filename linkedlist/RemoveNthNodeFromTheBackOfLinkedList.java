package com.manoj.linkedlist;

public class RemoveNthNodeFromTheBackOfLinkedList {
    public Node removeNthNodeFromTheBackOfLinkedListBruteForceApproach(Node head, int n){
        int size = 0;
        if(head == null) return null;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int nodeIndex = size-n+1;
        if(nodeIndex == 1) head  = head.next;
        else {
            temp = head;
            Node prev = head;
            for(int i = 1; i < nodeIndex; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = prev.next.next;
        }
        return head;
    }
    public Node removeNthNodeFromTheBackOfLinkedListOptimalApproach(Node head, int n){
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        for(int i = 0; i < n; i++) fast = fast.next;
        if(fast == null) return head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
