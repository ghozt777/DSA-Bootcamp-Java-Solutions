class Main{
    // driver code
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr)); // expected 5
    }
    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid]<arr[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}

// explanation:

/* 
    the basic idea is that even thought the array is striclyt sorted
    we compare arr[mid] with its left and right element and reduce our search space 
    accordingly
    TIP: if a number is equal to or greater than mid there always exixts a peak in that subarray 
    at the end both start and end point at the largest number and then we return it

*/