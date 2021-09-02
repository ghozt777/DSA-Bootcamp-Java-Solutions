import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mtnArr = new int[n];
        for(int i=0;i<n;i++){
            mtnArr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int ans = find(mtnArr,target);
        System.out.println(" in array :" + Arrays.toString(mtnArr)+ " ans is : "+ans);
    }
    static int find(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start < end){
            mid = start + (end-start)/2;
            System.out.println("start:"+start+" end: "+end+" mid: "+mid);
            if(arr[mid]<arr[mid+1]) start = mid + 1;
            else end = mid;
        }
        int newStart = 0;
        int newEnd = start;

        // for(int i=0;i<=start;i++) System.out.print(" "+arr[i]);
        // System.out.print(" ");
        // for(int i=start;i<arr.length;i++) System.out.print(" "+arr[i]);

        if(target==arr[start]) return start;

        while(newStart<=newEnd){
            mid = newStart + (newEnd - newStart)/2;
            if(arr[mid]<target) newStart = mid + 1;
            if(arr[mid]>target) newEnd = mid - 1;
            if(arr[mid]==target)return mid;
        }

        newStart = start;
        newEnd = arr.length-1;
        while(newStart<=newEnd){
            mid = newStart + (newEnd - newStart)/2;
            if(arr[mid]<target) newEnd = mid - 1;
            if(arr[mid]>target) newStart = mid + 1;
            if(arr[mid]==target)return mid;
        }

        return -1;
    }
}