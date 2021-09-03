
// FLOOR OF A NUMBER USING BINARY SEARCH

/*
    This is a program that calculates the largest 
    number in a sorted array that is eihter equal to or smaller than
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
        int floor = findFloor(arr,target);
        if(floor==-1) System.out.println("There is no floor in the array : "+ Arrays.toString(arr)+" for the target : "+target);
        else System.out.println("Floor for target: "+target+" in the array: "+Arrays.toString(arr)+" is at index: "+floor+" with a value of :"+arr[floor]);

        in.close();
    }

    static int findFloor(int[] arr,int target){
        // condition where no floor exsists
        if(arr[0]>target) return -1;
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
        ans = end;
        return ans;
    }

}