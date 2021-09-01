/*
    This is the solution of a problem where  given an array of numbers there
    exixts a unique sum of two numbers fins the numbers
*/


// https://leetcode.com/problems/two-sum/

import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] arr, int target){
        int[] ans = new int[2];
        int[] temp = new int[arr.length];
        // the problem with temp = ans is that it will point to the same
        // array and then sorting it will sort the original array 
        // and then we can never get back the original indices    
        // in Java everything is pass by value 
        // for primitives the actual value is copied
        // and for obejcts which includes arrays it copies the value of the 
        // reference variable which points to the OG array
        for(int i=0;i<arr.length;i++) temp[i] = arr[i];
        Arrays.sort(temp);
        int start = 0;
        int end = temp.length-1; 
        while(start<=end){
            int sum = temp[start]+temp[end];
            if(sum<target) start++;
            if(sum>target) end--;
            if(sum == target){
               break;
            }
        }
        System.out.println(Arrays.toString(arr)+" "+Arrays.toString(temp)+" "+"start: "+start+" end: "+end);
        boolean isThereAStart = false;
        for(int i=0;i<arr.length;i++){
            if(!isThereAStart) if(arr[i] == temp[start]) {ans[0] = i; isThereAStart = true;}
            if(arr[i] == temp[end]) ans[1] = i;
        }
        return ans;
    }
}