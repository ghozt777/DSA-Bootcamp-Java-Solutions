// leetcode link : https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

// ans in recursion not submitted due to exceeding time limit
// code wirks fine and outputs the correct ans

import java.lang.String;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(findKthBit(20,1048575));
    }
    static char findKthBit(int n, int k) {
        String S = helper(n,"0",1);
        return S.charAt(k-1);
    }
    static String helper(int n,String ans, int count){
        if(count==n) return ans;
        return helper(n , ans + "1" + invertAndReverse(ans) , count + 1);
    }
    static String invertAndReverse(String s){
        String ans = "";
        for(char c : s.toCharArray()){
            if(c == '1') ans = "0" + ans;
            else ans = "1" + ans;
        }
        return ans;
    }
}


    
