// this is a program where we find an element in an infinite array 
// IRL an infinite array cant be replicated 
// but to simulate an infinite array we can discard the length of the array
// and come up with a solution without using the length of the array

// kunals video link
// https://www.youtube.com/watch?v=W9QJ8HaRvJQ&t=7086s

class Main{
    public static void main(String[] args) {
       int[] arr = {-67,-12,-1,-0,0,5,7,12,34,39,42,51,68,69,89,90};
       int target = 69;
       System.out.println(findIndexUsingBinarySearch(arr,target));
    }
    static int findIndexUsingBinarySearch(int[] arr, int target){
        int start = 0;
        int end = 1;
        int mid;
        while(target > arr[end]){
            int newStart = end+1;
            end += 2*(end-start+1);
            start = newStart;
        }
        while(start<=end){
            mid = start + (end-start)/2;
            if(target>arr[mid]) start = mid + 1;
            else if(target<arr[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}