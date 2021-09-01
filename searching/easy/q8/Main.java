import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int k = in.nextInt();
        int kThMissing = findKthMissing(arr,k);
        System.out.println("The kth missing element is : " + kThMissing);
        in.close();
    }
    static int findKthMissing(int[] arr, int k ){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            // since the array elements start from 1 arr[i] if not missing any elements
            // must have i in it 
            // hence arr[mid] must have (mid+1) in it (its mid + 1 as the actual array is 0 indexed)
            // the difference arr[mid] - (mid+1) represents the number of missing elements 
            if(arr[mid]-mid-1<k) start = mid + 1; 
            // we are continuning the loop until we find an element where the no of missing element is just less than k
            // and then when we increase start it becomes more then end
            // and finally the loop terminates with start = end+1
            else end = mid - 1;
        }
        // return arr[end] + k - (arr[end] - end - 1);
        // instead of returning this big statement it can be 
        // reduced to k +end+1
        // and end+1 = start
        // hence the final return becomes k + start
        return k+ start;
    }
}