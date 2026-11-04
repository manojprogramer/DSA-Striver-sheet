package com.manoj.binarysearch;

public class CapacityToShipPackagesWithInDDays {
    public int capacityToShipPackagesWithInDDaysBruteForceApproach(int[] nums, int days){
        int totalWeight = 0;
        int maxWeight = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            totalWeight += nums[i];
            maxWeight = Math.max(maxWeight,nums[i]);
        }
        for(int i = maxWeight; i <= totalWeight; i++){
            int daysRequired = findDaysRequired(nums,i);
            if(daysRequired <= days) return i;
        }
        return -1;
    }
    public  int capacityToShipPackagesWithInDDaysOptimalApproach(int[] nums, int days){
        int totalWeight = 0;
        int maxWeight = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            totalWeight += nums[i];
            maxWeight = Math.max(maxWeight,nums[i]);
        }
        int low = maxWeight;
        int high = totalWeight;
        while(low <= high){
            int mid = (low+high)/2;
            int daysRequired = findDaysRequired(nums,mid);
            if(daysRequired <= days) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    private int findDaysRequired(int[] nums, int capacity) {
        int loadWeight = 0;
        int days = 1;
        for(int i = 0; i < nums.length; i++){
            if(loadWeight+nums[i] > capacity){
                days++;
                loadWeight = nums[i];
            }
            else loadWeight += nums[i];
        }
        return days;
    }
}
