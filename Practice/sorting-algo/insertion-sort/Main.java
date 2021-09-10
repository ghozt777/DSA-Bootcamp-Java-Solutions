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
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }
    static void swap(int[] arr , int e1 , int e2){
        int temp = arr[e1];
        arr[e1] = arr[e2];
        arr[e2] = temp;
    }
}