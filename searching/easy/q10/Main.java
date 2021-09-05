// this is a program to find the index of the peak in a mountain array
// Leetcode Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mtnArr = new int[n];
        for(int i=0;i<n;i++)
            mtnArr[i] = in.nextInt();
        int index = findPeakIndex(mtnArr);
        System.out.println("peak index: "+index+ " and the valus is: "+mtnArr[index]);
        in.close();
    }
    static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<end){
            mid = start + (end-start) / 2;
            if(arr[mid]>arr[mid+1]) end = mid;
            else start = mid + 1;
        }
        // at the end of the loop both the start and the end is going to point at the same index i.e. the biggest one or the peak in the mountain array
        
        // return start;  <--- this is also valid
        return end;

    }
}