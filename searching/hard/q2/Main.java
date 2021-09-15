package searching.hard.q2;
class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot==nums.length-1) return nums[0];
        else return nums[pivot+1];
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            // case 1
            if(mid<end&&arr[mid] > arr[mid+1]) return mid;
            // case 2
            if(mid>start&&arr[mid-1] > arr[mid]) return mid - 1;
            // case 3
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                if(start<end && arr[start] > arr[start+1]) return start;
                start++;
                if(end>start && arr[end] < arr[end-1]) return end-1;
                end--;
            }
            // case 4
            else if(arr[start] > arr[mid]) end = mid - 1;
            // case 5
            else start = mid + 1 ;
        }
        return -1;
    }
}