package com.manoj.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public void majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int sol = 0;
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > (nums.length/2)) {
                sol = key;
            }
        }
        System.out.println(sol);
    }
    public void majorityElementOptimalApproach(int[] nums) {
        int count = 0;
        int element = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(nums[i] == element)
                count++;
            else count--;
        }
        int count1 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == element) count1++;
        }
        if(count1 > (nums.length/2))
            System.out.println(element);
        else
            System.out.println(-1);
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 1, 2};
        MajorityElement m = new MajorityElement();
//        m.majorityElement(nums);
        m.majorityElementOptimalApproach(nums);
    }

}
