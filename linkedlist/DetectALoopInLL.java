package com.manoj.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DetectALoopInLL {
    public boolean detectALoopInLLBruteForceApproach(Node head) {
        Map<Node,Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            if(!map.isEmpty() && map.containsKey(temp)) return true;
            else {
                map.put(temp,1);
                temp = temp.next;
            }
        }
        return false;
    }
    public boolean detectALoopInLLOptimalApproach(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
