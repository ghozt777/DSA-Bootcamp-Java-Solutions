import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baseTen = in.nextInt();
        int baseFive = solution(baseTen);
        System.out.println(baseFive);
    }   
    static int solution(int num){
        int ans = 0;
        int power = 0;
        while(num>0){
            ans += num%5*Math.pow(10,power++);
            num /= 5;
        }
        return ans;
    }
}
