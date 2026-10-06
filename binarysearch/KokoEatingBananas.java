package com.manoj.binarysearch;

public class KokoEatingBananas {
    public int kokoEatingBananasBruteForceApproach(int[] nums,int h){
        int maxElement = 0;
        for(int i = 0; i < nums.length; i++)
            maxElement = Math.max(maxElement,nums[i]);
        for(int i = 0; i < maxElement; i++) {
            int totalHours = 0;
            totalHours = timeRequired(nums, i);
            if(totalHours <= h)
                return i;
        }
        return maxElement;
    }
    public int kokoEatingBananasOptimalApproach(int[] nums, int h){
        int maxElement = 0;
        for(int i = 0; i < nums.length; i++)
            maxElement = Math.max(maxElement,nums[i]);
        int low = 1, high = maxElement;
        while(low <= high){
            int mid = (low+high)/2;
            int totalHours = timeRequired(nums,mid);
            if(totalHours <= h)
                high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public int timeRequired(int[] nums, int pile){
        int totalHours = 0;
        for(int  i = 0; i < nums.length; i++){
            totalHours += (nums[i]+pile-1)/pile;
        }
        return totalHours;
    }
}
