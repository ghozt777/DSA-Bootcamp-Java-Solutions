import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target = 5;
        int index = findIndex(arr,target);
        System.out.println("index of: "+target+" in array: "+Arrays.toString(arr)+" is: "+index);
    }
    static int findIndex(int[] arr,int target){
        int start = 0;
        int end = 1;
        int mid;
    
        while(target > arr[end]){
            int newStart = end+1;
            end += 2*(end-start+1);
            start = newStart;
        }
        
        
        while(start<=end){
            mid = start + (end-start)/2;
            if(target>arr[mid]) start = mid + 1;
            else if(target<arr[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}