// leetcode link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    static int numberOfSteps(int num) {
        return helper(num , 0);
    }
    static int helper(int n , int steps){
        if(n==0) return steps;
        return helper( n%2 == 0 ? n/2 : n-1 , steps + 1);
    }
}
