import java.util.*;

public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int globalCount = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) System.out.print((globalCount++) + " ");
            System.out.println();
        }
    }
}
