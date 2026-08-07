package com.manoj.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public void longestConsecutiveSequenceBetterApproach(int[] nums) {
        int longest = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 1;
            int element = nums[i]+1;
            while(linearSearch(nums,element))
            {
                element = element+1;
                count++;
            }
            longest = Math.max(longest,count);
        }
        System.out.println(longest);
    }
    public void longestConsecutiveLinearSearch(int[] nums) {
        Arrays.sort(nums);
        int lastElement = Integer.MIN_VALUE;
        int count = 1;
        int longest = 0;
        for(int i = 0;i < nums.length; i++) {
            if(nums[i]-1 == lastElement)
            {
                count++;
                lastElement = nums[i];
            }
            else {
                lastElement = nums[i];
                count = 1;
            }
            longest = Math.max(longest,count);
        }
    }
    private boolean linearSearch(int[] nums, int element) {
        for(int i = 0; i < nums.length; i++)
            if(element == nums[i]) return true;
        return false;
    }
    public void longestConsecutiveSequenceOptimalApproach(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        for(int i : set) {
            if(!set.contains(i-1)){
                int count = 1;
                int current = i;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest = Math.max(count,longest);

            }
        }
        System.out.println(longest);
    }
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
//        l.longestConsecutiveSequence(nums);
//        l.longestConsecutiveSequenceBetterApproach(nums);
        l.longestConsecutiveSequenceOptimalApproach(nums);
    }
}
