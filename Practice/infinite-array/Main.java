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

        // each time we double the size of the search window
        // and by this way we optimize the searching algo as we use binary search
        // the difference is that insdea of diving the array by half every iteration
        // we just increase the search window by 2 times its previous width
        // hence its the exact opposite of binary search 

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

/*
    Note: The theory behind the solution for infinite array is that 
    we start with a window os 2 elements i.e. start = 0 and end = 1
    and we chech if arr[end] >  target or not in order to find the 
    upperbound for the window . In other words we are just trying to
    find the window that encapsulates the target 
    and then we get the start that is the starting index of the window
    ans end that is the last index of the found window
    
    In the process of finding the window we can have a specific width 
    of the window and we slide it to find the target and it works fine
    Eg start = 0 end = start + n // here we specified a window width of n
    and each time we dont find an element that is greater than the target(arr[end] > target)
    we just update the start by start = end + 1;
    and update end by end = end + n;

    Now the above solution works just fine but we can optimize it by using Binary Search

    the idea is that we start with a initial width of the search window of 2
    and for every iteration to find the element we just double the width of the
    search window
    eg : 
        loop run 0 : search window width : 2
        loop run 1 : search window width : 4
        loop run 2 : search window width : 8
        loop run 3 : search window width : 16

        hence we bring down the Time Complexity to O(log(n))
        and if we look colosely its just the opposite of Binary Search

            BINARY SEARCH       |        INFINITE ARRAY
     ---------------------------+------------------------------                               
    lr 0 : width : n            |   lr 0 : search window width : 1
    lr 1 : width : n/2          |   lr 0 : search window width : 2
    lr 2 : width : n/4          |   lr 0 : search window width : 4
    lr 3 : width : n/8          |   lr 0 : search window width : 8       
    .                               .
    .                               .
    .                               .
    lr i : width : n/Math.pow(2,i)    lr i : search window width : Math.pow(2,i)                  

*/
