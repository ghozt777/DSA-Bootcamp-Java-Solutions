import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {   
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }      
        }
                        
        int row = in.nextInt();
        int col = in.nextInt();
        System.out.println(Arrays.toString(solution(arr,row,col)));
    } 
    static int[] solution(int[][] arr,int row, int col){
        int[] ans = new int[100 ];
        int itr = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i!=row&&j!=col){
                    ans[itr++] = arr[i][j];
                }
            }
        }
        return ans;
    }   
}
