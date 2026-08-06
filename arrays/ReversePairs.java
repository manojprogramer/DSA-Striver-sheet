package com.manoj.arrays;

public class ReversePairs {
    public int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if(low < high){
            int mid = (low+high)/2;
            count += mergeSort(arr,low,mid);
            count += mergeSort(arr,mid+1,high);
            count+= comparePair(arr,low,mid,high);
            merge(arr,low,mid,high);
//            System.out.println(count);
        }
        return count;
    }
    public void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++)
            L[i] = arr[low+i];
        for(int j = 0; j < n2; j++)
            R[j] = arr[mid+1+j];
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2) {
            if(L[i] < R[j]){
                arr[k++] = L[i++];
            }
            else {
                arr[k++] = R[j++];
            }
        }
        while(i < n1) {
            arr[k++] = L[i++];
        }
        while(j < n2) {
            arr[k++] = R[j++];
        }
    }
    public int comparePair(int[] arr, int low, int mid, int high) {
        int right = mid+1;
        int count = 0;
        for(int i = low; i <= mid; i++) {
            while(right <= high && arr[i] > 2*arr[right])
                right++;
            count = count+(right-(mid+1));
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 3, 3};
        ReversePairs r = new ReversePairs();
        System.out.println(r.mergeSort(arr,0,arr.length-1));
    }
}
