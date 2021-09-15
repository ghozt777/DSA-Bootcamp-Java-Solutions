class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(search(arr,1));
    }

    static int search(int[] arr , int target){
        int pivot = findPivot(arr);
        System.out.println(pivot);
        if(pivot==-1) return binarySearch(arr, 0, arr.length-1, target);
        int index = binarySearch(arr, 0, pivot, target);
        if(index!=-1) return index;
        return binarySearch(arr, pivot+1, arr.length-1, target);
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

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(mid<end&&arr[mid]>arr[mid+1]) return mid;
            if(mid>start&&arr[mid-1] > arr[mid]) return mid - 1;
            if(arr[start]<arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
}