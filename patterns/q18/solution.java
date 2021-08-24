import java.util.*;

public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<(n-i);j++) System.out.print("*");
            for(int k=2*i;k>0;k--) System.out.print(" ");
            for(int l=j-1;l>=0;l--) System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            int j;
            for(j=0;j<(n-i);j++) System.out.print("*");
            for(int k=2*i;k>0;k--) System.out.print(" ");
            for(int l=j-1;l>=0;l--) System.out.print("*");
            System.out.println();
        }
    }
}
