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
        List<Integer> ans = new ArrayList<Integer>();
        for(int i : num) ans.add(i);
        int[] add = new int[String.valueOf(k).length()];
        for(int i=0;i<add.length;i++){
            add[add.length-i-1] = k%10;
            k /= 10;
        }
        int ptr = ans.size()-1;
        for(int i=add.length-1;i>=0;i--){
            if(ptr<0){
                ans.add(0,0);
                ptr++;
            }
            ans.set(ptr,ans.get(ptr)+add[i]);
            ptr--;
        }
        for(int i=ans.size()-1;i>=1;i--){
            if(ans.get(i)>9){
                ans.set(i-1,ans.get(i-1)+1);
                ans.set(i,(ans.get(i))-10);
            }
        }

        if(ans.get(0)>9){
            ans.add(0,1);
            ans.set(1,ans.get(1)-10);
        }

        return ans;
    }   
}
