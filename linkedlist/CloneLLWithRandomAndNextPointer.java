package com.manoj.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CloneLLWithRandomAndNextPointer {
    public Node cloneWithRandomAndNextPointer(Node head) {
        Node temp = head;
        Map<Node,Node> map = new HashMap<>();
        while(temp != null) {
            Node newNode = new Node(temp.data);
            map.put(temp,newNode);
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {
            Node copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);
            copyNode.child = map.get(temp.child);
            temp = temp.next;
        }
        return map.get(map.get(head));
    }
    public Node cloneWithRandomAndNextPointerOptimalApproach(Node head) {
        insertBetweenNodes(head);
        connectRandomPointers(head);
        return copyLL(head);
    }

    private Node copyLL(Node head) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        Node temp = head;
        while(temp != null) {
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }

    private void connectRandomPointers(Node head) {
        Node temp = head;
        while(temp != null){
             Node copyNode = temp.next;
             if(temp.child != null){
                 copyNode.child = temp.child.next;
             }
             else {
                 copyNode.child = null;
             }
             temp = temp.next.next;
        }
    }

    private void insertBetweenNodes(Node head) {
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
    }
}
