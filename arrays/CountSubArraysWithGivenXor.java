package com.manoj.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysWithGivenXor {
    int count = 0;
    public void countSubArraysWithGivenXorBruteForceApproach(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++) {
            int xor = 0;
            for(int j = i; j < nums.length; j++) {
                xor = xor ^ nums[j];
                if(xor == k) count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] nums= {5, 2, 9};
        CountSubArraysWithGivenXor c = new CountSubArraysWithGivenXor();
//        c.countSubArraysWithGivenXorBruteForceApproach(nums,5);
        c.countSubArraysWithGivenXorOptimalApproach(nums,7);
    }

    public void countSubArraysWithGivenXorOptimalApproach(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int xor = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];
            int x = xor ^ k;
            if(!map.isEmpty() && map.containsKey(x)) count += map.get(x);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        System.out.println(count);
    }
}
