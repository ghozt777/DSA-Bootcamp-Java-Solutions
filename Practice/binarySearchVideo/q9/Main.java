// rotated array with duplicate
class Main{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,7,8,1,1,2,2,3};
        int pivot = findPivot(arr);
        System.out.println(arr[pivot]);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<end){
            mid = start = (end-start) / 2;
            if((mid<end)&&arr[mid]>arr[mid+1]) return mid;
            if((mid>start)&&arr[mid]<arr[mid-1]) return mid-1;
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                if((start<end)&&arr[start]<arr[start+1]) start++;
                else return start;
                if((start<end)&&arr[end]>arr[end-1]) end--;
                else return end;
            }
            if(arr[start]<arr[mid] || (arr[start] == arr[mid]&&arr[mid]>arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}