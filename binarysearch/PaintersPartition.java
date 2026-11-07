package com.manoj.binarysearch;

public class PaintersPartition {
    public int painterPartitionBruteForceApproach(int[] C, int A, int B){
        long max = Integer.MIN_VALUE;
        long totalBoard = 0;
        for(int i = 0; i < C.length; i++){
            max = Math.max(max,C[i]);
            totalBoard += C[i];
        }
        for(long i = max; i <= totalBoard; i++){
            int countPainters = findTotalPainters(C,i);
            if(countPainters <= A) {
                return (int) ((B*i)%10000003);
            }
        }
        return -1;
    }
    public int painterPartitionOptimalApproach(int[] C, int A, int B){
        long low = Integer.MIN_VALUE;
        long high = 0;
        for(int i = 0; i < C.length; i++){
            low = Math.max(low,C[i]);
            high += C[i];
        }
        while(low <= high){
            long mid = (low+high)/2;
            int countPainter = findTotalPainters(C,mid);
            if(countPainter <= A) high = mid-1;
            else low = mid+1;
        }

        return (int)((low*B)%10000003);
    }
    public int findTotalPainters(int[] arr, long board){
        int painter = 1;
        long totalBoard = 0;
        for(int i = 0; i < arr.length; i++){
            if(totalBoard+arr[i] <= board) totalBoard += arr[i];
            else {
                painter++;
                totalBoard = arr[i];
            }
        }
        return painter;
    }
}
