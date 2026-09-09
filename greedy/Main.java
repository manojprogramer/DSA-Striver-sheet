package com.manoj.greedy;

public class Main {
    public static void main(String[] args) {
        NMeetingsOneRoom n = new NMeetingsOneRoom();
        int[] nums1 = {60,100,120};
        int[] nums2 = {10,20,30};
        int[][] jobs = {{1,4,20},{2,1,10},{3,1,40},{4,1,30}};
//        System.out.println(n.nMeetingsOneRoom(nums1,nums2))
//        MinimumNumberOFPlatformRequiredForTrain m = new MinimumNumberOFPlatformRequiredForTrain();
//        System.out.println(m.minimumNumberOfPlatformRequiredForTrainBruteForceApproach(nums1,nums2));
//        System.out.println(m.minimumNumberOfPlatformRequiredForTrainOptimalApproach(nums1,nums2));
//        JobSequencingProblem j =new JobSequencingProblem();
//        System.out.println( j.jobSequencingProblem(jobs));
        FractionalKnapsack f = new FractionalKnapsack();
//        System.out.println(f.fractionalKnapsack(nums1,nums2,50));
        System.out.println(f.fractionalKnapsackSecondApproach(nums1,nums2,50));
    }

}
