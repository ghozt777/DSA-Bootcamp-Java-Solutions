import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] digits = new int[n];
        for(int i=0;i<n;i++)    
            digits[i] = in.nextInt();
        int k = in.nextInt();
        List<Integer> ans = new ArrayList<Integer>(addToArrayForm(digits,k));
        System.out.print(Arrays.toString(ans.toArray()));
    } 
    static List<Integer> addToArrayForm(int[] num, int k){
        
        // copying the elements of num array into a List of type Integer and this is going to be the List returend from the function as a answer
        List<Integer> ans = new ArrayList<Integer>();
        for(int i : num) ans.add(i);
        
        // the add array is going to cantain every digit of k 
        int[] add = new int[String.valueOf(k).length()]; 
        for(int i=0;i<add.length;i++){
            add[add.length-i-1] = k%10;
            k /= 10;
        }

        // addding individual digits of ans and add in a synchronized manner
        // initially ptr points to the last digit of ans List
        // initially i points to the last digit of add array 
        int ptr = ans.size()-1;
        for(int i=add.length-1;i>=0;i--){
            // checking if there are no digits in the ans List then append 0s at the front
            if(ptr<0){
                ans.add(0,0);
                ptr++;
            }
            // adding indivial digits of ans and add
            ans.set(ptr,ans.get(ptr)+add[i]);
            ptr--;
        }

        // this loop is to check if an individual digits is greater than 9 or not
        // if it is then add 1 to the previous digit and subtract 10 from the current digit
        // the loop iterates from the end to the index 1 as for 0 i-1 = -1 and it will give a out of bounds error
        for(int i=ans.size()-1;i>=1;i--){
            if(ans.get(i)>9){
                ans.set(i-1,ans.get(i-1)+1);
                ans.set(i,(ans.get(i))-10);
            }
        }

        // since the prev loop runs only till 1 index 0th index is not checked and there can be a situation where ans.get(0) or the first digit in the ans List is greater than 10 
        // In that case append a 1 at the begging and this will increase its size by 1 and then size 0th posiiton now caontains a 1 subtract 10 from the original digit  that is now at the 1st position
        if(ans.get(0)>9){
            ans.add(0,1);
            ans.set(1,ans.get(1)-10);
        }

        return ans;
    }   
}
