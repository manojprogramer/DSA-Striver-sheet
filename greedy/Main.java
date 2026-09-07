package com.manoj.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        NMeetingsOneRoom n = new NMeetingsOneRoom();
        int[] nums1 = {10, 12, 20};
        int[] nums2 = {20, 25, 30};
        System.out.println(n.nMeetingsOneRoom(nums1,nums2));
    }

}
