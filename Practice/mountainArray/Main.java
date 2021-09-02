import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mtnArr = new int[n];
        for(int i=0;i<n;i++){
            mtnArr[i] = in.nextInt();
        }
        int peak = findPeak(mtnArr);
        System.out.println("peak in array :" + Arrays.toString(mtnArr)+" is: "+peak+" and the value is : "+mtnArr[peak]);
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start < end){
            mid = start + (end-start)/2;
            System.out.println("start:"+start+" end: "+end+" mid: "+mid);
            if(arr[mid]<arr[mid+1]) start = mid + 1;
            else end = mid;
        }
        return end;
        // return end; any of the return statements can be used as when the loop 
        // ends start == end
    }
}