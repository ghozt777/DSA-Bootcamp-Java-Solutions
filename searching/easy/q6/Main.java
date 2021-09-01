import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of coins: ");
        int n = in.nextInt();
        int row = getRow(n);
        System.out.println("row is : "+row);
    }
    static int getRow(int n){
        long start = 1;
        long end = n;
        long mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if((mid*(mid+1)/2)>n) end = mid - 1;
            if((mid*(mid+1)/2)<n) start = mid+1;
            if((mid*(mid+1)/2)==n) return (int)mid;
        }
        return (int)end;
    }
}