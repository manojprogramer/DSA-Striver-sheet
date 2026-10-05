package com.manoj.arrays;

public class MaximumSubArraySumAfterOneOperation {
    public int maximumSubArraySumAfterOneOperation(int[] nums){
        int noOp = nums[0];
        int oneOp = nums[0] * nums[0];

        int answer = oneOp;

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            int newNoOp = Math.max(
                    x,
                    noOp + x
            );

            int newOneOp = Math.max(
                    x * x,
                    Math.max(
                            noOp + x * x,
                            oneOp + x
                    )
            );

            noOp = newNoOp;
            oneOp = newOneOp;

            answer = Math.max(answer, oneOp);
        }

        return answer;

    }
}
