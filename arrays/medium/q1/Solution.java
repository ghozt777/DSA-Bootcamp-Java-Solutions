import java.util.*;
class Solution{
    public static void main(String[] args) {
        int[][] matrix= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        List<Integer> ans = new ArrayList<>();
        ans.addAll(spiralOrder(matrix));
        for(int i=0;i<ans.size();i++) System.out.print(ans.get(i) + " ");
        System.out.println();
    }
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int top,bottom,left,right;
        top = 0;
        bottom = m;
        left = 0;
        right=n;
        int cycle = 0;
        while(top<=bottom && left<=right){
            if(cycle==0){
                for(int i=left;i<=right;i++) ans.add(matrix[top][i]);
                top++;
            }
            if(cycle==1){
                for(int i=top;i<=bottom;i++) ans.add(matrix[i][right]);
                right--;
            }

            if(cycle==2){
                for(int i=right;i>=left;i--) ans.add(matrix[bottom][i]);
                bottom--;
            }

            if(cycle==3){
                for(int i=bottom;i>=top;i--) ans.add(matrix[i][left]);
                left++;
            }
            cycle = (cycle+1)%4;
            // the entire point of adding cycle is to make sure that only one add operation is performed per cycle
        }
        return ans;
    }
}