package com.manoj.binarysearch;

public class FirstAndLastOccurrence {
    public int[] firstAndLastOccurrenceBruteForceApproach(int[] arr, int x){
        int first = -1, last = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                if(first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first,last};
    }
    public int lowerBound(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x)
            {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;

    }
    public int upperBound(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > x)
            {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;

    }
    public int[] firstAndLastOccurrenceOptimalApproach1(int[] nums, int x){
        int lb = lowerBound(nums,x);
        if((lb == nums.length || nums[lb] != x))
            return new int[]{-1,-1};
        return new int[]{lb,upperBound(nums,x)-1};
    }
    public int[] firstAndLastOccurrenceOptimalApproach2(int[] nums, int target){
        int first = firstOccurrence(nums,target);
        if(first == -1) return new int[]{-1,-1};
        int last = lastOccurrence(nums,target);
        return new int[]{first,last};
    }

    private int lastOccurrence(int[] nums, int target) {
        int last = -1;
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else high = mid-1;
        }
        return last;
    }

    private int firstOccurrence(int[] nums, int target) {
        int first = -1;
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else high = mid-1;
        }
        return first;

    }

}
