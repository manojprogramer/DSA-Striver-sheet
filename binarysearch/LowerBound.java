package com.manoj.binarysearch;

public class LowerBound {
    public int lowerBound(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                System.out.println("Entering");
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}
