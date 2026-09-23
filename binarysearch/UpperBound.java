package com.manoj.binarysearch;

public class UpperBound {
    public int upperBound(int[] arr, int target){
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}
