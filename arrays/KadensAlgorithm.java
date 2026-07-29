package com.manoj.arrays;

public class KadensAlgorithm {
    public void subArraySumApproach1(int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum > max)
                    max = sum;
            }
        }
        System.out.println(max);
    }
    public void subArraySumApproach2(int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum > max) max = sum;

            if(sum < 0) sum = 0;
        }
        System.out.println(max);
    }
}
