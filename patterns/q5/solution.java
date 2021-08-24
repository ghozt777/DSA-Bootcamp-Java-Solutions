import java.util.*;

public class solution {
    public static void main(String[] args){
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=2*n-i;j>=0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
