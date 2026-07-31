package com.manoj.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public void mergeTwoSortedArraysBruteForceApproach(int[] nums1, int n, int[] nums2, int m) {
        int left = 0;
        int right = 0;
        int index = 0;
        int[] nums3 = new int[n];
        while(left < (n-m)  && right < m) {
            if(nums1[left] <= nums2[right])
                nums3[index++] = nums1[left++];
            else nums3[index++] = nums2[right++];
        }
        while(left < (n-m)){
            nums3[index++] = nums1[left++];
        }
        while(right < m) {
            nums3[index++] = nums2[right++];
        }
        for(int i = 0; i < n; i++)
            nums1[i] = nums3[i];
    }
    public void mergeTwoSortedArraysOptimalApproach1(int[] nums1, int m, int[] nums2, int n) {
        int left = (m-n-1),right = 0;
        while(left >= 0 && right < n)
        {
            if(nums1[left] >= nums2[right])
            {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;

            }
            else break;

        }
        int ind = 0;
        for(int i = m-n; i < m; i++) {
            nums1[i] = nums2[ind++];
        }
        Arrays.sort(nums1);

    }
    public void swap(int[] nums1, int n, int[] nums2, int m) {
        int temp = nums1[n];
        nums1[n] = nums2[m];
        nums2[m] = temp;


    }
//    public void mergeTwoSortedArraysOptimalApproach2(int[] nums1, int m, int[] nums2, int n) {
//        int gap = (m/2)+(m%2);
//        while(gap > 0) {
//            int left = 0;
//            int right = gap;
//            while(right < m) {
////                 nums1 And nums2
//                if(left < (m-n) && right >= (m-n))
//                    swap(nums1,left,nums2,right-(m-n));
//
////                Both are in Nums1
//                else if(left < (m-n) && right < (m-n))
//                    swap(nums1,left,nums1,right);
////                Both are in Nums2
//                else {
//                    swap(nums1, left - (m - n), nums2, right - (m - n));
//                }
//                left++;
//                right++;
//            }
//            if(gap == 1) break;
//            gap = (gap/2)+(gap%2);
//        }
////        for(int i= )
//    }
////    public void swap(int[] nums1, int n, int[] nums2, int m) {
////        if(nums1[n] > nums2[m]) {
////            int temp = nums1[n];
////            nums1[n] = nums2[m];
////            nums2[m] = temp;
////        }
////        for(int i = 0; i < nums1.length; i++)
////            System.out.print(nums1[i]+"\t");
////        System.out.println( );
////    }

}
