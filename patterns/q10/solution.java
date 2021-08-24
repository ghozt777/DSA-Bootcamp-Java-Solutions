import java.util.*;
public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noOfSpaces = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<noOfSpaces;j++)
                System.out.print(" ");
            for(int k=0;k<(2*i + 1);k++){
                if(k%2==0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            noOfSpaces--;
        }
    }
    
}
