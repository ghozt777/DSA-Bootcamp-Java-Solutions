// works fine but the memoru limit exceeds

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        System.out.println(kthGrammar(1,1));
    }
    static int kthGrammar(int n, int k) {
        return Integer.parseInt(String.valueOf(helper(n,1,"0").charAt(k-1)));
    }
    static String helper(int n , int count , String ans){
        if(count == n) return ans;
        ans = ans.replace("0" , "05");
        ans = ans.replace("1" , "10");
        ans = ans.replace("5" , "1");
        return helper(n,count+1,ans);
    }
}

