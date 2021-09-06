// Count Negative Numbers in a Sorted array
// Main Solution
// In this part I just find the total number of negative integers in a array using binary search
// Leetcode Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n =in.nextInt();
        int[][] grid = new int[m][n]; 
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                grid[i][j] = in.nextInt();
        int ans =  countNegatives(grid);
        System.out.println("ans: "+ans);
        in.close();
    }
    static int countNegatives(int[][] grid){
        int count = 0;
        for(int[] row : grid){
            count += countNegativesIn1D(row);
        }
        return count;
    }
    static int countNegativesIn1D(int[] arr){
        if(arr[arr.length-1]>=0) return 0;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]>=0) start = mid + 1;
            else end = mid - 1;
        }
        return (arr.length-1-end);
    }
}

