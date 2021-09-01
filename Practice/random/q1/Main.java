import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = in.nextInt();
        int ans = solution(arr);
        System.out.println("ans is : " + ans);
    }

    static int solution(int[] arr){
        int maxSum = Integer.MIN_VALUE;  
        int tempSum=arr[0];  
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                tempSum +=arr[i];
            }else{
                maxSum = Math.max(maxSum,tempSum);
                tempSum = arr[i];
            }
        }
        maxSum = Math.max(maxSum,tempSum);
        return maxSum;
    }
}