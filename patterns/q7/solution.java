import java.util.*;
public class solution {
    public static void main(String[] args){
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
          for(int k=1;k<i;k++){
              System.out.print(" ");
            }
          for(int j=n-i;j>=0;j--){
            System.out.print("*");
            }
            System.out.println();
        }

    }
}
