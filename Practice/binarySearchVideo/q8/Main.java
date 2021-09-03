class Main{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        int target = 2;
        int index = findIndex(arr,target);
        System.out.println(index);
    }

    static int findIndex(int[] arr,int target){
        int pivot = findPivot(arr);
        // if not rotated
        int index = -1;
        if(pivot==-1){
            index = binarySearch(arr, target, 0, arr.length-1, true);
        }else{
            index = binarySearch(arr, target, 0, pivot, true);
            if(index!=-1) return index;
            else{
                index = binarySearch(arr, target, pivot+1, arr.length-1, true);
            }
        }
        return index;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            //CASE 1:
            if((mid<end)&&arr[mid]>arr[mid+1]) return mid;
            // CASE 2:
            if((mid>start)&&arr[mid]<arr[mid-1]) return mid - 1;
            // CASE 3:
            if(arr[start]>=arr[mid]) end = mid - 1;
            // CASE 4:
            if(arr[start]<arr[mid]) start = mid + 1;
        }
        return -1;
    }

    static int binarySearch(int[] arr,int target, int start,int end, boolean isAscending){
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]<target){
                if(isAscending) start = mid + 1;
                else end = mid - 1;
            }
            else if(arr[mid]>target){
                if(isAscending) end = mid - 1;
                else start = mid + 1;
            }
            else return mid;
        }
        return -1;
    }


}