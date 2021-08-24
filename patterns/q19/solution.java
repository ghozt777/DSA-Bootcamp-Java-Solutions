import java.util.*;

public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int j,k;
            for(j=0;j<i+1;j++) System.out.print("*");
            for(k=0;k<2*(n-i-1);k++) System.out.print(" ");
            for(k=j-1;k>=0;k--) System.out.print("*");
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            int j,k;
            for(j=0;j<i+1;j++) System.out.print("*");
            for(k=0;k<2*(n-i-1);k++) System.out.print(" ");
            for(k=j-1;k>=0;k--) System.out.print("*");
            System.out.println();
        }
    }
}
