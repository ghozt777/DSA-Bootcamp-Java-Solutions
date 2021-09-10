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
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int max = maxInSubArray(arr, 0, arr.length-i-1);
            swap(arr,max,arr.length-i-1);
        }
    }
    static int maxInSubArray(int[] arr , int start , int end){
        int max = start;
        for(int i=start+1;i<=end;i++){
            if(arr[i]>arr[max]) max = i;
        }
        return max;
    }
    static void swap(int[] arr ,int e1 ,int e2){
        int temp = arr[e1];
        arr[e1] = arr[e2];
        arr[e2] = temp;
    }
}

// In Selecion sort u select the largest element in the subarray and swap
// it with the very last element of the subarray