package com.manoj.binarysearch;

import java.util.*;

class Values {
    double value1;
    int value2;
    Values(double value1, int value2){
        this.value1 = value1;
        this.value2 = value2;

    }
}
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
    public double minimizeMaxDistanceToGasStationBetterApproach(int[] nums, int k){
        PriorityQueue<Values> priorityQueue = new PriorityQueue<>((a,b) -> Double.compare(b.value1,a.value1));
        int[] howMany= new int[nums.length];
        for(int i = 0; i < nums.length-1; i++){
            int diff = nums[i+1]-nums[i];
            priorityQueue.add(new Values(diff,i));
        }
        for(int i = 1; i <= k; i++){
//            double diff = priorityQueue.peek().value1;
            int index = priorityQueue.peek().value2;
            priorityQueue.poll();
            howMany[index]++;
            double sectionLength = ((double) nums[index+1]-nums[index])/(howMany[index]+1);
            priorityQueue.add(new Values(sectionLength,index));

        }

    return priorityQueue.peek().value1;
    }
    public double minimizeMaxDistanceToGasStationOptimalApproach(int[] nums, int k){
        double low = 0;
        double high = 0;
        double max = Double.MIN_VALUE;
        for(int i = 0; i < nums.length-1;i++){
            max = Math.max(max,nums[i]);
        }
        high = max;
        double diff = 1e-6;
        while((high-low) > diff){
            double mid = (low+high)/2.0;
            double count = noOfGasStationsRequired(nums,mid);
            if(count > k) low = mid;
            else high = mid;
        }
        return high;
    }
    int noOfGasStationsRequired(int[] nums, double distance){
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            int numberInBetween = (int) ((nums[i+1]-nums[i])/ distance);
            if(numberInBetween == (numberInBetween*distance))
            {
                numberInBetween--;
            }
            count += numberInBetween;
        }
        return count;
    }
}
