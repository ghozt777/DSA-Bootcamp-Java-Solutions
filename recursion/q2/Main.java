public class Main {
    public static void main(String[] args) {
        int[] arr = {-9,12,45,-69,100};
        int min = getMin(arr,0,arr.length);
        int max = getMax(arr,0,arr.length);
        System.out.println("min: "+min+" max: "+max);
    }    
    static int getMin(int[] arr, int index , int n){
        if(n==1) return arr[index];
        return Math.min(arr[index],getMin(arr,index+1,n-1));
    }
    static int getMax(int[] arr, int index , int n){
        if(n==1) return arr[index];
        return Math.max(arr[index],getMax(arr,index+1,n-1));
    }
}
