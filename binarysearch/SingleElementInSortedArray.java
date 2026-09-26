package com.manoj.binarysearch;

public class SingleElementInSortedArray {
    public int singleElementInSortedArrayBruteForceApproach(int[] nums){
       if(nums.length == 1) return nums[0];
       for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                if (nums[i] != nums[i + 1]) return nums[i];
            }
            else if(i == nums.length-1){
                if(nums[i] == nums[i-1]) return nums[i];
            }
            else if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) {
                return nums[i];}
        }
        return -1;

    }
    public int singleElementInSortedArrayOptimalApproach(int[] nums){
        int low = 1, high= nums.length-2;
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        while (low <= high){
            int mid = (low+high)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1]))
                low = mid+1;
            else high = mid-1;

        }
        return -1;
    }
}
//1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6
//-9715,-9715,-8044,-8044,-7288,-7288,-6108,-6108,-5941,-5332,-5332,-4507,-4507,-3254,-3254,-1889,-1889,-1259,-1259,3157,3157,3246,3246,4537,4537,4963,4963,5945,5945]