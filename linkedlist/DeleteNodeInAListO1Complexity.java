package com.manoj.linkedlist;

public class DeleteNodeInAListO1Complexity {
    public void deleteNodeInAListO1Complexity(Node node) {
        if (node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        } else {
            node = node.next;
        }
    }
}
