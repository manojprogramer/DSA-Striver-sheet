package com.manoj.binarysearch;

public class MinimizeMaxDistanceToGasStation {
    public double minimizeMaxDistanceToGasStationBruteForceApproach(int[] nums, int k){
        int[] howMany= new int[nums.length];
        for(int gas = 1; gas <= k; gas++)
        {
            double maxValue = -1;
            int maxIndex = -1;
            for(int  i = 0; i < nums.length-1; i++){
                int diff = nums[i+1]-nums[i];
                double sectionLength = (double)diff / (howMany[i]+1);
                if(maxValue < sectionLength){
                    maxValue = sectionLength;
                    maxIndex = i;
                }
            }
            howMany[maxIndex]++;
        }
        double maxValue = -1;
        for(int i = 0; i < nums.length-1; i++){
            int diff = nums[i+1]-nums[i];
            double sectionLength = (double)diff/(howMany[i]+1);
            maxValue = Math.max(maxValue,sectionLength);
        }
        return maxValue;
    }
}
