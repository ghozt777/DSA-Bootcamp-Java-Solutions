import java.util.Arrays;

 class Similar{
     public static void main(String[] args) {
         int[] arr = {1,2,3,4,5};
         printTriangle(arr,arr.length);
     }
     static void printTriangle(int[]arr, int n ){
         if(n==0)return;
         if(n==arr.length){
             for(int num : arr) System.out.print(num + " ");
             System.out.println();
             printTriangle(arr, n-1);
         }
         else {
            for(int i=0;i<n;i++){
                arr[i] += arr[i+1];
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            printTriangle(arr, n-1);
         }
     }
 }