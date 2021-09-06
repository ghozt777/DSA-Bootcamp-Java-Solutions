// Count Negative Numbers in a Sorted array
// Part 1
// In this part I just find the total number of negative integers in a array using binary search
// Leetcode Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int ans = countNegatives(arr);
        System.out.println("no: of negative integers: "+ (arr.length-1-ans));
    }
    static int countNegatives(int[] arr){
        if(arr[arr.length-1]>=0) return arr.length-1;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]>=0) start = mid + 1;
            else end = mid- 1;
        }
        System.out.println("end: "+end);
        return end;
    }
}