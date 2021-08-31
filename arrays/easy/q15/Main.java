import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat  = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = in.nextInt();

        int sum = diagonalSum(mat);
        System.out.println(sum);
    }
    static int diagonalSum(int[][] mat){
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i] + mat[i][mat.length-i-1];
        }
        if(mat.length%2==1) sum -= mat[(mat.length-1)/2][(mat.length-1)/2];
        return sum;
    }
}