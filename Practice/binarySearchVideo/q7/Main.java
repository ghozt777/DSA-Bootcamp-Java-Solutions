import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        System.out.println("ans: "+findTarget(arr, target));
    }

    static int findTarget(int[] arr,int target){
        int peak = findPeak(arr);
        int index = binarySearch(arr,target,0,peak,true);
        if(index==-1){
            index = binarySearch(arr,target,peak+1,arr.length-1,false);
        }
        else{
            return index;
        }
        return index;
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<end){
            mid = start + (end-start) / 2;
            if(arr[mid]>arr[mid+1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    static int binarySearch(int[] arr,int target, int start,int end, boolean isAscending){
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]<target){
                if(isAscending) start = mid + 1;
                else end = mid - 1;
            }
            else if(arr[mid]>target){
                if(isAscending) end = mid - 1;
                else start = mid + 1;
            }
            else return mid;
        }
        return -1;
    }
}