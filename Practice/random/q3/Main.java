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
        ArrayList<Integer> ans = new ArrayList<>(solution(arr,row,col));
        for(int i=0;i<ans.size();i++) System.out.print(ans.get(i)+" ");
    } 
    static List<Integer> solution(int[][] arr,int row, int col){
        
        List<Integer> ans = new ArrayList<>();
    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i!=(row)&&j!=(col)){
                ans.add(arr[i][j]);
                }
            }
        }
        return ans;
    }   
}
