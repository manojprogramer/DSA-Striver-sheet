package com.manoj;

import java.util.ArrayList;
import java.util.List;

public class DivisorOfNumber {
    public static int[] divisorOfNumber(int n){
        List<Integer> list=  new ArrayList<>();
        for(int i =1 ; i <= n; i++) {
            if(n%i == 0)
                list.add(i);
        }
        int[] nums = new int[list.size()];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
