import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(matrix,16)));
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length - 1;
        int midCol = cols / 2;
        int rStart = 0;
        int rEnd = rows - 1;
        while((rEnd-1)>rStart){
            int mid = rStart + (rEnd-rStart) / 2;
            if(matrix[midCol][mid]==target) return new int[] {midCol,mid};
            if(matrix[midCol][mid]<target) rStart = mid;
            else rEnd = mid; 
        }
        if(matrix[rStart][midCol]==target) return new int[] {rStart,midCol};
        if(matrix[rEnd][midCol]==target) return new int[] {rEnd,midCol};
        if(matrix[rStart][midCol - 1]>=target) return  binarySearch(matrix,rStart,0,midCol-1,target);
        if(matrix[rStart][midCol + 1 ]<=target&&target<=matrix[rStart][cols]) return binarySearch(matrix,rStart,midCol+1,cols,target);
        if(matrix[rEnd][midCol-1]>=target) return binarySearch(matrix,rEnd,0,midCol-1,target);
        else return binarySearch(matrix,rEnd,midCol+1,cols,target);

    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart) / 2;
            if(matrix[row][mid]==target) return new int[] {row,mid};
            if(matrix[row][mid]<target) cStart = mid + 1;
            else cEnd = mid -1 ; 
        }
        return new int[] {-1,-1};
    }
}
