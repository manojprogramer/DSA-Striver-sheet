package com.manoj.binarysearch;

public class FindHowManyTimesTheArrayIsRotated {
    public int findHowManyTimesTheArrayIsRotated(int[] nums){
        int n = nums.length;
        int low = 0, high = n-1;
        int index = -1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[low] <= nums[high]){
                if(nums[low] <= ans){
                    ans = nums[low];
                    index = low;
                }
                low = mid+1;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low] <= ans)
                {
                    ans = nums[low];
                    index = low;
                }
                low = mid+1;
            }
            else if(nums[mid] <= nums[high]){
                if(nums[mid] <= ans) {
                    ans = nums[mid];
                    index = mid;
                }
                high = mid-1;
            }
        }
        return index;
    }
}
