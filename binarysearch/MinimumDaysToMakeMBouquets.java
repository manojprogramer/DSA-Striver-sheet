package com.manoj.binarysearch;

public class MinimumDaysToMakeMBouquets {
    public int minimumDaysToMakeMBouquetsBruteForceApproach(int[] nums, int m, int k){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        for(int i = min; i <= max; i++){
            int bouquets = findMBouquets(nums,i,k);
            if(bouquets >= m) return i;
        }
        return -1;
    }
    public int minimumDaysToMakeMBouquetsOptimalApproach(int[] nums, int m, int k){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int low = min, high = max;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            int bouquets = findMBouquets(nums,mid,k);
            if(bouquets >= m) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    private int findMBouquets(int[] nums, int min, int k) {
        int count = 0, bouquets = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= min){
                count++;
            }
            else {
                if(count >= k)
                    bouquets += count/k;
                count = 0;
            }

        }
        if(count >= k){
            bouquets += count/k;
        }
        return bouquets;
    }
}
