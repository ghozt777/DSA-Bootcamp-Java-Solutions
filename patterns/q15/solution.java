import java.util.*;

public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<(n-1-i);j++){
        System.out.print(" ");
        }

        for(int k=0;k<(2*i+1);k++){
            if(k==0||k==(2*i)) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
    }

    for(int i=1;i<n;i++){
            
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int k=(2*(n-i-1));k>=0;k--){
            if(k==0||k==(2*(n-i-1))) System.out.print("*");
            else System.out.print(" ");
            }
        System.out.println();
    }

    }
}
