package com.manoj.binarysearch;

public class SearchElementInSortedArrayI {
    public int searchElementInSortedArrayBruteForceApproach(int[] nums, int target){
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == target) return i;
        return -1;
    }
    public int searchElementInSortedArrayOptimalApproach(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid-1;
                }
                else low = mid+1;
            }
            else {
                if(nums[mid] <= target && target <= nums[high])
                    low = mid+1;
                else high = mid-1;
            }

        }
        return -1;
    }
}
