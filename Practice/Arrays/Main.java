import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6},
            {7},
            {8,9,10,11,12,13,14,15,16,17}
        };
        for(int row =0;row<arr.length;row++){
            for(int column = 0; column<arr[row].length;column++){
                System.out.print(arr[row][column]+ ", ");
            }
            System.out.println();
        }

        System.out.println("using Arrays.toString and for Each loop to print every row");
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

        // wrapper class for Integer
        Integer a = 10345;
        System.out.println(a.toString());
    }
}