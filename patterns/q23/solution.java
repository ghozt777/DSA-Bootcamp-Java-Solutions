import java.util.*;

class solution{
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 2*(n-1)-1;
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++) System.out.print(" ");
            System.out.print("*");
            if(i==1){
                for(int j=odd;j>=1;j--) System.out.print(" ");
                System.out.print("*");
            }
            else if(i!=n){
                for(int j=(2*i-3);j>=1;j--) System.out.print(" ");
                System.out.print("*");
                for(int j=odd;j>=1;j--) System.out.print(" ");
                System.out.print("*");
                for(int j=(2*i-3);j>=1;j--) System.out.print(" ");
                System.out.print("*");
            }else{
                for(int j=(2*i-3);j>=1;j--) System.out.print(" ");
                System.out.print("*");
                for(int j=(2*i-3);j>=1;j--) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            odd -= 2;
            if(odd<0)odd=0;
        }
        
    }
}