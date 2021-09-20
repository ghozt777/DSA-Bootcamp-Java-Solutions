class Main{
    public static void main(String[] args) {
        int[][] matrix = {
           {-8,-8,-6},
           {-3,-2,0}
        };
        System.out.println(searchMatrix(matrix,-8));
    }
    static boolean searchMatrix(int[][] matrix, int target){
        if(matrix[0].length==1){
            int start = 0;
            int end = matrix.length - 1;
            while(start<=end){
                int mid = start + (end-start) / 2;
                if(matrix[mid][0]==target) return true;
                if(matrix[mid][0]<target) start = mid+1;
                else end = mid -1; 
            }
            return false;
        }
        if(matrix.length==1){
            int start = 0;
            int end = matrix[0].length - 1;
            while(start<=end){
                int mid = start + (end-start) / 2;
                if(matrix[0][mid]==target) return true;
                if(matrix[0][mid]<target) start = mid+1;
                else end = mid -1; 
            }
            return false;
        }
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int rStart = 0;
        int rEnd = row;
        int cMid = col / 2;
        while(rStart < rEnd - 1){
            int mid = rStart + (rEnd-rStart) / 2;
            if(matrix[mid][cMid]==target) return true;
            else if(matrix[mid][cMid]<target) rStart = mid;
            else rEnd = mid;
        }

        System.out.println(rStart+" "+rEnd);

        if(matrix[rStart][cMid]==target) return true;
        if(matrix[rEnd][cMid]==target) return true;
        
        if(cMid-1>=0&&target<=matrix[rStart][cMid-1]) return binarySearch(matrix, rStart, 0, cMid-1, target);

        if(cMid+1<=col&&target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][col]) return binarySearch(matrix,rStart, cMid+1,col, target);

        if(cMid-1>=0&&target<=matrix[rEnd][cMid-1]) return binarySearch(matrix, rEnd, 0, cMid-1, target);

        else return binarySearch(matrix, rEnd, 0, col, target);


    }
    static boolean binarySearch(int[][] matrix, int row, int start, int end, int target){
        System.out.println(row+" "+start+" "+end);
        while(start<=end){
            int mid = start + (end-start) / 2;
            System.out.println(mid);
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]<target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}