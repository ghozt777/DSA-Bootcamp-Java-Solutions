import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] {6,2,6,5,1,2}));
    }
    static int arrayPairSum(int[] arr){
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length; i+= 2){
            sum += arr[i];
        }
        return sum;
    }
}