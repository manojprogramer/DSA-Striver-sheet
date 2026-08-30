package com.manoj.linkedlist;

public class ReverseLLInGroupOfK {
    public Node reverseLLInGroupOfK(Node head, int k){
        Node temp = head;
        Node prevLast = null;
        Node nextNode;
        while(temp != null) {
            Node kThNode = findKthNode(temp,k);
            if(kThNode == null) {
                if(prevLast != null) prevLast.next = temp;
                break;
            }
            nextNode = kThNode.next;
            kThNode.next = null;
            reverseLL(temp);
            if(temp == head) head = kThNode;
            else {
                prevLast.next = kThNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }

    private void reverseLL(Node head) {
        Node prev = null;
        Node temp =  head;
        Node nextNode = head;
        while(nextNode != null) {
            nextNode = nextNode.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
    }

    Node findKthNode(Node temp, int k) {
        k -= 1;
        while(temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
}
