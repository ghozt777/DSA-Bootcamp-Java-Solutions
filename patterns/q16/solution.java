import java.util.*;

public class solution {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pascal = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                pascal[i][j] = 0;
            }
        }
        pascal = getPascal(pascal, n);
        int printedPascalCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                if(k%2==0){
                    System.out.print(pascal[i][printedPascalCount++]);
                }
                else{
                    System.out.print(" ");
                }
            }
            printedPascalCount=0;
            System.out.println();
        }


    }


    private static int[][] getPascal(int[][] pascal,int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    pascal[i][j]=1;
                }
                else{
                    pascal[i][j] = (pascal[i-1][j]+pascal[i-1][j-1]);
                }
            }
        }
        return pascal;

    }

}
