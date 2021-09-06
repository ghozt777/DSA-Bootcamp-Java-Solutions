import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        int[] ans = searchRange(arr,target);
        System.out.println("start: "+ans[0]+" end: "+ans[1]);
        in.close();
    }
    static int[] searchRange(int[] arr, int target){
        int[] ans = new int[2];
        ans[0] = findStartingIndex(arr,target);
        ans[1] = findEndingIndex(arr,target);
        return ans;
    }
    static int findStartingIndex(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int ans = -1;
        while(start<=end){
            mid  = start + (end-start) / 2;
            if(arr[mid]==target){
                ans = mid;
                end = mid - 1 ;
            }
            if(arr[mid]>target) end = mid - 1;
            if(arr[mid]<target) start = mid + 1;
        }
        return ans;
    }
    static int findEndingIndex(int[] arr , int target){
        int start = 0;
        int end= arr.length-1;
        int mid = 0;
        int ans = -1;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]==target){
                ans = mid;
                start = mid + 1;
            }
            if(arr[mid]>target) end = mid - 1;
            if(arr[mid]<target) start = mid + 1;
        }
        return ans;
    }
}