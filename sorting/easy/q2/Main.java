import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));    
    }
    static int majorityElement(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]) break;
                else {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        int curr = 1;
        int maxElement = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])curr++;
            else curr = 1;
            if(curr>max){
                max = curr;
                maxElement=arr[i];
            }
        }
        System.out.println("maxElemtn: "+maxElement+" count: "+max);
        return maxElement;
    }
}