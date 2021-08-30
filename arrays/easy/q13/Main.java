import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] image = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                image[i][j] = in.nextInt();
        
        int[][] modifiedImage = flipAndInvertImage(image);
        for(int[] row : modifiedImage)
            System.out.print(Arrays.toString(row));
    }
    static int[][] flipAndInvertImage(int[][] image){
        int start,end,temp;
        for(int[] row : image){
            start = 0;
            end = row.length-1;
            while(start<=end){
                temp = row[start];
                row[start] = row[end]==1?0:1;
                row[end] = temp==1?0:1; 
                start++;
                end--;
            }
        }
        return image;
    }
}
