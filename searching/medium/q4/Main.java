class Main{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(arr,2));
    }

    static boolean search(int[] arr , int target){
        int pivot = findPivotWithDuplicates(arr);
        int index = binarySearch(arr, 0, pivot, target);
        if(index!=-1) return true;
        return binarySearch(arr, pivot+1, arr.length-1, target)!=-1;
    }

    static int binarySearch(int[] arr , int start , int end , int target){
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) start = mid + 1;
            if(arr[mid]>target) end = mid - 1;
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
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
            else if(arr[start]==arr[mid]&&arr[end]<arr[mid]||arr[start]<arr[mid]) start = mid + 1;
            // case 5
            else end = mid - 1 ;
        }
        return -1;
    }
}