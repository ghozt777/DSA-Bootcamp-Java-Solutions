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

        if(i!=(n-1)){
            for(int k=0;k<(2*i+1);k++){
                if(k==0||k==(2*i)) System.out.print("*");
                else System.out.print(" ");
            }
        }else{
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
        }

        System.out.println();
    }
  
} 
}
