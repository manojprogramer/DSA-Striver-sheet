package com.manoj.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class FindTheStartingPointInLL {
    public Node findTheStartingPointInLLBruteForceApproach(Node head){
        Map<Node,Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            if(!map.isEmpty() && map.containsKey(temp)) return temp;
            map.put(temp,1);
            temp = temp.next;
        }
        return null;
    }
    public Node findTheStartingPointInLLOptimalApproach(Node head){
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                flag = true;
                break;
            }
        }
        if(flag){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }

}
