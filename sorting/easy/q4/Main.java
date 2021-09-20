// leetcode link: https://leetcode.com/problems/missing-number/

// Its a problen that can be solved using Cyclic Sort

import java.util.Arrays;
import java.util.Scanner;
// Driver Code
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];        
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int ans = missingNumber(arr);
        System.out.println("ans: "+ans);
        in.close();
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]!=i&&arr[i]<arr.length){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }else i++;
        }
        for(i=0;i<arr.length;i++) if(arr[i]!=i) return i;
        return arr.length; // if the number lies outside the range of array
    }
}