package com.manoj.binarysearch;

public class MedianOfTwoSortedArrays {
    public int medianOfTwoSortedArraysBruteForceApproach(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int[] nums3 = new int[n];
        int i = 0, j = 0, k = 0;
        while(i <  n1 && j < n2){
            if(nums1[i] <= nums2[j])
                nums3[k++] = nums1[i++];
            else
                nums3[k++] = nums2[j++];
        }
        while(i < n1) nums3[k++] = nums1[i++];
        while (j < n2) nums3[k++] = nums2[j++];
        if(n%2 == 0) {
            int ans = (nums3[n/2]+nums3[n/2-1])/2;
            return ans;
        }
        else return nums3[n/2];
    }
    public int medianOfTwoSortedArraysOptimalApproach(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;

        int index1 = n/2;
        int index2 = n/2-1;

        int element1 = 0;
        int element2 = 0;

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                if(k == index1)
                    element1 = nums1[i];
                if(k == index2)
                    element2 = nums1[i];
                i++;
                k++;
            }
            else {
                if(k == index1)
                    element1 = nums2[j];
                if(k == index2)
                    element2 = nums2[j];
            }
            j++;
            k++;
        }
        while(i < n1){
            if(k == index1)
                element1 = nums1[i];
            if(k == index2)
                element2 = nums1[i];
            i++;
            k++;
        }
        while (j < n2){
            if(k == index1)
                element1 = nums2[j];
            if(k == index2)
                element2 = nums2[j];
        }
        if(n % 2 == 1) return  element1;
        else return (element1+element2)/2;
    }
}
