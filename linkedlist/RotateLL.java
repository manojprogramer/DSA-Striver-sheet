package com.manoj.linkedlist;

public class RotateLL {
    public Node rotateLL(Node head, int k) {
        Node temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        temp.next = head;
        if(k % len == 0) return  head;
        k = k % len;
        System.out.println(len);
        int size = len-k;
        System.out.println(size);
        temp = head;
        while(temp != null && size > 1) {
            size--;
            temp = temp.next;
        }
        System.out.println(temp.next.data);
        head = temp.next;
        temp.next = null;

        return head;
    }

}
