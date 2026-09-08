package com.manoj.greedy;

import java.util.Arrays;

public class MinimumNumberOFPlatformRequiredForTrain {
    public int minimumNumberOfPlatformRequiredForTrainBruteForceApproach(int[] nums1, int[] nums2){
        int maxCount = 0;
        for(int i = 0; i < nums1.length-1; i++)
        {
            int count = 1;
            for(int j = i+1; j < nums1.length; j++){
                if(nums1[j] < nums2[i]){
                    count++;
                }
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
    public int minimumNumberOfPlatformRequiredForTrainOptimalApproach(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int count = 0, maxCount = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) {
                count++;
                maxCount = Math.max(count, maxCount);
                i++;
            }
            else {
                count--;
                j++;
            }
        }
        return maxCount;
    }
}
