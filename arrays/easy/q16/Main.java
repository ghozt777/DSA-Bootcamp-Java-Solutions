import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
public class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] numbers = new int[n];
       for(int i=0;i<n;i++)
        numbers[i] = in.nextInt();
        
       int totalNumberOfEvenNumbers = findNumbers(numbers);
       System.out.print(totalNumberOfEvenNumbers); 
   } 
   static int findNumbers(int[] numbers){
       int ans = 0;
       for(int number : numbers)
        if(String.valueOf(number).length()%2==0)ans++;
        
        return ans;
   }
}
