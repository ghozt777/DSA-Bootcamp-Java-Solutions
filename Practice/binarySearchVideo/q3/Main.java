
// 744. Find Smallest Letter Greater Than Target
// Leetcode link = https://leetcode.com/problems/find-smallest-letter-greater-than-target/



import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        char[] arr = new char[n];
        for(int i=0;i<n;i++)
            arr[i] = in.next().charAt(0);
        System.out.println("Enter target: ");
        char target = in.next().charAt(0);
        int ans = findSmallest(arr,target);
        System.out.println("Index : "+ans+" value: "+arr[ans]);

        in.close();
    }

    static int findSmallest(char[] arr,char target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]<=target) start = mid + 1;
            else end = mid - 1;
        }
        ans = start%arr.length;
        return ans;
    }

}