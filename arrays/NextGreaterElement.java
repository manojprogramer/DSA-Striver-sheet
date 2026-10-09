package com.manoj.arrays;

public class NextGreaterElement {
    public int[] nextGreaterElementBruteForceApproach(int[] nums1, int[] nums2){
        int[] sol = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            sol[i] = searchGreaterElement(nums2,nums1[i]);
        }
        return sol;
    }

    private int searchGreaterElement(int[] nums, int value) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == value){
                while(i < nums.length) {
                    if(nums[i] > value) return nums[i];
                    i++;
                }

            }
        }
        return -1;
    }
}
