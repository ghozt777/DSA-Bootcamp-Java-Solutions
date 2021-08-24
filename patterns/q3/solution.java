import java.util.*;

class solution{
    public static void main(String args[]){
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1-i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}