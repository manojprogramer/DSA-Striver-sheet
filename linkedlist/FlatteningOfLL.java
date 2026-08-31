package com.manoj.linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FlatteningOfLL {
    public Node flatteningOfLLBruteForceApproach(Node head) {
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            Node temp2 = temp;
            while(temp2 != null){
                list.add(temp2.data);
                temp2 = temp2.child;
            }
            temp = temp.next;
        }
        Collections.sort(list);
        return convertLL(list);
    }

    public Node convertLL(List<Integer> list) {
        Node newHead = new Node(list.getFirst());
        Node temp = newHead;
        for(int i = 1; i < list.size(); i++){
            Node newNode = new Node(list.get(i));
            temp.child = newNode;
            temp = newNode;
        }
        return newHead;
    }
    public Node flatteningOfLLOptimalApproach(Node head) {
        return flatteningOfLL(head);
    }

    public Node flatteningOfLL(Node head) {
        if(head == null || head.next == null) return head;
        Node mergeHead = flatteningOfLL(head.next);
        return mergeLL(head, mergeHead);
    }
    public Node mergeLL(Node head, Node mergeHead){
        Node dummyHead = new Node(-1);
        Node result = dummyHead;
        while(head != null && mergeHead !=null) {
            if(head.data < mergeHead.data){
                result.child = head;
                result = head;
                head = head.child;
            }
            else {
                result.child = mergeHead;
                result = mergeHead;
                mergeHead = mergeHead.child;
            }
            result.next = null;
        }
        if(head != null) result.child = head;
        if(mergeHead != null) result.child = mergeHead;
        return  dummyHead.child;
    }



}
