package searching.hard.q5;
// Leetcode Link: https://leetcode.com/problems/split-array-largest-sum/

// Diver Code

class Main{
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        int ans = splitArray(arr,m);
        System.out.println(ans);
    }
    static int splitArray(int[] arr, int m){

        int start=0;
        int end=0;
        int mid=0;
        int parts=1; // as the minumun number of parts can be 1 

        for(int num : arr){
            end += num;
            start = Math.max(start, num);
        }

        while(start < end){
            mid = start + (end-start) / 2;
            parts = 1;
            int currSum = 0;
            for(int num : arr){
                if(currSum + num > mid){
                    currSum = num;
                    parts++;
                }
                else{
                    currSum += num;
                }
            }
            if(parts>m){
                start = mid + 1;
            }
            else{
                end = mid; 
            }
        }

        return start; // here start==end
    }
}