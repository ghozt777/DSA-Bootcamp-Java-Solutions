import java.util.*;

public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=0;i--){
            
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            
            for(int j=(2*(i-1)+1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
