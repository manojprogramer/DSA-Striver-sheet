package com.manoj.binarysearch;

public class FindSquareRootOfNumber {
    public int findSquareRootOfNumberBruteForceApproach(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++)
            if(i*i <= n)
                ans = i;
        else break;
        return ans;
    }
    public int findSquareRootOfNumberOptimalApproach(int n){
        long low = 1, high = n;
        while(low <= high){
            long mid = (low+high)/2;
            long val =((long) mid *mid);
            if(val <= n) low = mid+1;
            else high = mid-1;
        }
        return (int) high;
    }
}
