import java.util.Arrays;
class Main{
    public static void main(String[] args) {
      int[][] mat = {{1,1},{0,1}};
      int[][] target = {{1,1},{1,0}};
      boolean ans = findRotation(mat, target);
      System.out.println(ans);
    }
    static boolean findRotation(int[][]mat,int[][] target){
        for(int i=0;i<4;i++){
            boolean flag = true;
            for(int j=0;j<target.length;j++){
                for(int k=0;k<target[j].length;k++){
                    if(mat[j][k]!=target[j][k]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) return true;
            else{
                rotateArr(mat);
                for(int[] row:mat){
                    System.out.println(Arrays.toString(row));
                }
            }
            System.out.println();
        }
        return false;
    }

    static void rotateArr(int[][] arr){
        int temp;
        //transponse logic:
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reversing each row
        for(int i=0;i<arr.length;i++){
            int start = 0;
            int end = arr.length-1;
            while(start<end){
                temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}