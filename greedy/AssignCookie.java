package com.manoj.greedy;

import java.util.Arrays;

public class AssignCookie {
    public int assignCookie(int[] student, int[] cookie){
        Arrays.sort(student);
        Arrays.sort(cookie);
        int left = 0, right = 0;
        while(left < student.length && right < cookie.length){
            if(cookie[right] >= student[left]){
                left++; right++;
            }
            right++;
        }
        return left;
    }
}
