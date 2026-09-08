package com.manoj.greedy;

import java.util.Arrays;

public class JobSequencingProblem {
    public int jobSequencingProblem(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> Integer.compare(b[2], a[2]));
        int maxDeadline = 0;
        for (int[] arr : jobs) {
            maxDeadline = Math.max(maxDeadline, arr[1]);
        }
        int[] arr = new int[maxDeadline + 1];
        int maxProfit = 0;
        int count = 0;
        Arrays.fill(arr, -1);
        for (int[] a : jobs) {
            int deadline = a[1];
            while (deadline > 0) {
                if (arr[deadline] == -1) {
                    maxProfit += a[2];
                    count++;
                    arr[deadline] = a[0];
                    break;
                }
                deadline--;
            }
        }
        return count;
    }
}
