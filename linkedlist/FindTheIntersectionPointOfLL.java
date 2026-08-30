package com.manoj.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class FindTheIntersectionPointOfLL {
    public Node findTheIntersectionPointOfLLBruteForceApproach(Node head1, Node head2){
        Map<Node,Integer> map = new HashMap<>();
        Node temp = head1;
        while(temp != null) {
            map.put(temp,1);
            temp = temp.next;
        }
        temp = head2;
        while (temp != null) {
            if(map.containsKey(temp))
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public Node findTheIntersectionPointOfLLBetterApproach(Node head1, Node head2){
       Node temp = head1;
       int n1= 0,n2 = 0;
        while(temp != null) {
            n1++;
            temp = temp.next;
        }
        temp = head2;
        while(temp != null) {
            n2++;
            temp = temp.next;
        }
        if(n1 < n2) return collisionPoint(head1,head2,n2-n1);
        else return collisionPoint(head2,head1,n1-n2);
    }

    Node collisionPoint(Node head1, Node head2, int i) {
        while(i != 0){
            i--;
            head2 = head2.next;
        }
        while(head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }
    public Node findIntersectionPointOfLLOptimalApproach(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == temp2) return temp1;
            if(temp1 == null) temp1 = head2;
            if(temp2 == null) temp2 = head1;
        }
        return temp1;
    }
}
