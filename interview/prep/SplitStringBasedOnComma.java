package com.manoj.interview.prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class SplitStringBasedOnComma {
    public String splitStringBasedOnComma(String s) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            String[] arr = bufferedReader.readLine().split(" ");
            int[] nums = new int[n];
            for(int j = 0; j < nums.length; j++){
                nums[j] = Integer.parseInt(arr[j]);
            }
            int outPut = solve(n,nums);
        }
    return null;

    }

    private int solve(int n, int[] nums) {
        return 1;
    }
}
