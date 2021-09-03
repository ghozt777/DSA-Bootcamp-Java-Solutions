import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        int[] ans = findFirstAndLastPos(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findFirstAndLastPos(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]>target) end = mid - 1;
            else if(arr[mid]<target) start = mid + 1;
            else {
                ans[0] = mid;
                end = mid - 1;
            }
        }
        start = 0;
        end = arr.length-1;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]>target) end = mid - 1;
            else if(arr[mid]<target) start = mid + 1;
            else {
                ans[1] = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}