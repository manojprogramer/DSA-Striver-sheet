package com.manoj.slidingwindowandtwopointers.slidingwindow;

public class MaximumPointsYouCanObtainFromCards {
    public int maximumPointsYouCanObtainFromCards(int[] nums, int k){
        int leftSum = 0, rightSum = 0, max = 0;
        int n = nums.length;
        int rightIndex = n-1;
        for(int i = 0; i < k; i++)
            leftSum += nums[i];
        max = Math.max(leftSum,max);
        for(int i = k-1; i >= 0; i--){
            leftSum -= nums[i];
            rightSum += nums[rightIndex--];
            max = Math.max(max,leftSum+rightSum);
        }
        return max;
    }
}
