
// CEILING OF A NUMBER USING BINARY SEARCH

/*
    This is a program that calculates the smallest 
    number in a sorted array that is eihter equal to or greater than
    a target number
*/

import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        System.out.println("Enter target: ");
        int target = in.nextInt();
        int ceiling = findCeiling(arr,target);
        if(ceiling==-1) System.out.println("There is no ceiling in the array : "+ Arrays.toString(arr)+" for the target : "+target);
        else System.out.println("Ceiling for target: "+target+" in the array: "+Arrays.toString(arr)+" is at index: "+ceiling+" with a value of :"+arr[ceiling]);

        in.close();
    }

    static int findCeiling(int[] arr,int target){
        // condition where no ceiling exsists
        if(arr[arr.length-1]<target) return -1;
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]<target) start = mid + 1;
            else if(arr[mid]>target) end = mid - 1;
            else return mid;
        }
        ans = start;
        return ans;
    }

}