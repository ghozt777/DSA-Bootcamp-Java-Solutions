import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isSwapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
    }
    static void swap(int[] arr , int e1 , int e2){
        int temp = arr[e1];
        arr[e1] = arr[e2];
        arr[e2] = temp;
    }
}

//  in every iteration of the outer loop it puts the max element left in the 
// subarray at the very last position and if there are no swaps that happened
// then it means that the remaining array is sorted and there is no nedd to 
// continue to loop furthur