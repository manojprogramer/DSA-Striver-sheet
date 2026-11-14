package com.manoj.binarysearch;

public class KthElementOfTwoSortedArrays {
    public int kthElementOfTwoSortedArraysBruteForceApproach(int[] nums1, int[] nums2, int key){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int[] nums3 = new int[n];
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j])
                nums3[k++] = nums1[i++];
            else
                nums3[k++] = nums2[j++];
        }
        while(i < n1)
            nums3[k++] = nums1[i++];
        while(j < n2)
            nums3[k++] = nums2[j++];
        return nums3[key-1];
    }
    public int kthElementOfTwoSortedArraysBetterApproach(int[] a, int[] b, int key){
        int n1 = a.length;
        int n2 = b.length;
        int n = n1+n2;
        int i = 0, j = 0, k = 0;
        while(i < n1 && j <n2){
            if(a[i] <= b[j]){
                if(k == key-1)
                    return a[i];
                i++;
                k++;
            }
            else {
                if(k == key-1)
                    return b[j];
                j++;
                k++;
            }

        }
        while(i < n1)
        {
            if(k == key-1)
                return a[i];
            i++;
            k++;

        }

        while(j < n2){
            if(k == key-1)
                return b[j];
            j++;
            k++;
        }
        return -1;

    }
    public int KthElementOfTwoSortedArraysOptimalApproach(int[] nums1, int[] nums2, int key){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int left = key;
        if(n == 0) return 0;
        if(n1 > n2) return KthElementOfTwoSortedArraysOptimalApproach(nums2,nums1,key);
        int low = Math.max(key-n2,0), high = Math.min(key,n1);
        while(low <= high){
            int mid1 = (low+high)/2;
            int mid2 = left-mid1;
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1-1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2-1];

            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];

            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }
            if(l1 > r2) high = mid1-1;
            else low = mid1+1;
        }
        return 0;
    }

}
