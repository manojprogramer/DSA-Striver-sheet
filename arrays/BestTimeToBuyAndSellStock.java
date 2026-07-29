package com.manoj.arrays;

public class BestTimeToBuyAndSellStock {
    public int bestTimeToBuyAndSellStock(int[] arr) {
        int min = arr[0],profit = 0,max = 0;
        for(int i = 1; i < arr.length; i++) {
            profit = arr[i]-min;

            max = Math.max(max,profit);
            min = Math.min(min,arr[i]);
        }
        return max;
    }
}
