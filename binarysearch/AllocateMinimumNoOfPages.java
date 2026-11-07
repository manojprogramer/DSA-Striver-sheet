package com.manoj.binarysearch;

public class AllocateMinimumNoOfPages {
    public int allocateMinimumNoOfPagesBruteForceApproach(int[] pages, int m) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if(m > pages.length) return -1;
        for(int i = 0; i < pages.length; i++){
            sum += pages[i];
            max = Math.max(max,pages[i]);
        }
        for(int i = max; i <= sum; i++){
            int studentCount = findStudents(pages,i);
            if(studentCount <= m) return i;
        }
        return -1;
    }
    public int allocateMinimumNoOfPagesOptimalApproach(int[] pages, int m) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if(m > pages.length) return -1;
        for(int i = 0; i < pages.length; i++){
            sum += pages[i];
            max = Math.max(max,pages[i]);
        }
        int low = max, high = sum;
        int ans = 0;
        while(low <= high){
            int mid = (low+high)/2;
            int countStudents = findStudents(pages,mid);
            if(countStudents <= m) high = mid-1;
            else  low = mid+1;
        }
        return low;
    }
    public int findStudents(int[] nums, int noOfpages){
        int student = 1;
        int pages = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]+pages <= noOfpages){
                pages += nums[i];
            }
            else {
                student++;
                pages = nums[i];
            }
        }
        return student;
    }
}
