import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int peak = findPeak(arr);
        System.out.println("Peak in :"+ Arrays.toString(arr)+" is: "+peak+"of value: "+arr[peak]);
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int ans = 0;
        while(start<end){
            mid = start + (end-start) / 2;
            if(arr[mid]<arr[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}