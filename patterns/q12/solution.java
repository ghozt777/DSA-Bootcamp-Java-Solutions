import java.util.*;

public class solution {
    public static void main(String[] args) {
        
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){

            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*(n-i)-1);j++){
                if(j%2==0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
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
