import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int[][] matrix = {
          {1,2,3},
          {4,5,6},
          {7,8,9}
      };
      int[][] ans = transpose(matrix);
      for(int[] row : ans) {
          System.out.println(Arrays.toString(row));
      }
    }  
    static int[][] transpose(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }  
}
