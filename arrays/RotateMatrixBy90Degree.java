package com.manoj.arrays;

public class RotateMatrixBy90Degree {
    public void rotateMatrixBy90DegreeBruteForceApproach(int[][] arr) {
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[0].length;j++)
                temp[i][j] = arr[i][j];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[j][arr.length-1-i] = temp[i][j];
            }
        }

    }
    public void rotateMatrixBy90OptimalApproach(int[][] arr) {
//        Transpose the Matrix
        for(int i = 0; i < arr.length-1;i++) {
            for(int j = i+1; j < arr.length; j++) {
                swap(i,j,arr);
            }
        }
        for(int[] temp : arr) {
            reverse(temp);
        }
    }
    public void swap(int n, int m, int[][] arr) {
        int temp = arr[n][m];
        arr[n][m] = arr[m][n];
        arr[m][n] = temp;
    }
    public void reverse(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
    public void display(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
