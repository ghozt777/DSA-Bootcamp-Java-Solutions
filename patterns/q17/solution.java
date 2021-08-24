import java.util.*;
public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=i+1;j>=1;j--) System.out.print(j);
            for(int j=2;j<=i+1;j++) System.out.print(j);
            System.out.println();
        }
    }
    
}
