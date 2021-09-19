import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,38,50}
        };
        System.out.println(Arrays.toString(search(matrix,50)));
    }
    static int[] search(int[][] matrix , int target){
        int col = matrix[0].length-1;
        int row = 0;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==target) return new int[] {row,col};
            if(matrix[row][col]>target) col--;
            else row++;
        }
        return new int[] {-1,-1};
    }
}