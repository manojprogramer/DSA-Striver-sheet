package com.manoj.binarysearch;

public class FindNthRootOfNumber {
    public int findNthRootOfNumber(int N, int M){
        int low = 0, high = M;
        while(low <= high){
            int mid = (low+high)/2;
            long sol = findPower(mid,N);
            if(sol == M) return mid;
            else if(sol > M) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }

    private long findPower(int mid, int n) {
        long sol = 1;
        for(int i = 0; i < n; i++){
            sol = sol*mid;
            if(sol > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return sol;
    }
}
