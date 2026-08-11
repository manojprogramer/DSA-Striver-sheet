package com.manoj.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public void longestSubArrayWithSumKBruteForceApproach(int[] arr, int k) {
        int longest = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                 sum += arr[j];
                 count++;
                if(sum == k){
                    longest = Math.max(count, longest);
                    break;
                }
                if(sum > k) break;
            }
        }
        System.out.println(longest);
    }
    public void longestSubArrayWithSumKBetterApproach(int[] nums, int key) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(sum == key) {
                maxLen = Math.max(maxLen,i+1);
            }
            else {
                int sol = sum-key;
                if(!map.isEmpty() && map.containsKey(sol)){
                    int len = i-map.get(sol);
                    maxLen = Math.max(len,maxLen);
                }
            }
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        System.out.println(maxLen);
    }
    public void longestSubArrayWithSumOptimalApproach(int[] nums, int key) {
        int left = 0, right = 0;
        int maxLen = 0;
        int sum = nums[0];
        while(right < nums.length) {
            if(sum > key) {
                sum -= nums[left++];

            }
            if(sum == key) {
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right < nums.length) sum += nums[right];
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        LongestSubArrayWithSumK l = new LongestSubArrayWithSumK();
//        l.longestSubArrayWithSumKBruteForceApproach(nums,1);
//        l.longestSubArrayWithSumKOptimalApproach(nums,1);
//        l.longestSubArrayWithSumKBetterApproach(nums,1);
        l.longestSubArrayWithSumOptimalApproach(nums,15);
    }


}
