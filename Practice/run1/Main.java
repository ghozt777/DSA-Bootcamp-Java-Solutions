import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println("Enter the value u want to search in : " + Arrays.toString(arr));
        int x = in.nextInt();
        int result = linerSearch(arr,x);
        System.out.println("The position is : " + result);
        in.close();
    }

    static int linerSearch(int[] arr,int x){
        int pos = -1;
        int i=0;
        for(int item : arr){
            if(item==x){
                pos = i;
                return pos;
            }
            i++;
        }
        return pos;
    }
}