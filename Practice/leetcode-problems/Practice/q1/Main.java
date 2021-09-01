import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] arr = {5,6,6,6,7,7,7,8,8,10};
        int target = 7;
        int[] indices = findIndices(arr,target);
        System.out.println(Arrays.toString(indices));
    }
    static int[] findIndices(int[] arr, int target){
        int[] ans = new int[2];
        int start,end,mid=0;
        start = 0;
        end = arr.length-1;

        while(start<=end){
            mid = (start+end)/2;
            if(target > arr[mid]) start = mid+1;
            if(target < arr[mid]) end = mid - 1;
            if(target==arr[mid]){
                ans[0] = mid;
                end = mid-1;
            }
        }

        start = 0;
        end = arr.length-1;
        mid=0;

        while(start<=end){
            mid = (start+end)/2;
            if(target > arr[mid]) start = mid+1;
            if(target < arr[mid]) end = mid - 1;
            if(target==arr[mid]){
                ans[1] = mid;
                start = mid+1;
            }
        }

        return ans;
    }
}